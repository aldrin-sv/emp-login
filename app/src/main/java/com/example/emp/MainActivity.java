package com.example.emp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1;

    String getName,getPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.mn1);
        et2=(EditText) findViewById(R.id.mn2);

        btn1=(Button) findViewById(R.id.mb1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getName=et1.getText().toString();
                getPass=et2.getText().toString();

                if ("admin".equals(getName) && "12345".equals(getPass))
                {
                    Intent ob=new Intent(getApplicationContext(),menuActivity.class);
                    startActivity(ob);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}