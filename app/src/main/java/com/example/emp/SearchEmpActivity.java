package com.example.emp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchEmpActivity extends AppCompatActivity {

    Button btn7,btn8;
    EditText et8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_emp);

        et8=(EditText) findViewById(R.id.sn1);

        btn7=(Button) findViewById(R.id.sb1);
        btn8=(Button) findViewById(R.id.sb2);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obje1=new Intent(getApplicationContext(), menuActivity.class);
                startActivity(obje1);
            }
        });
    }
}