package com.geektech.hw6_2m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView inter, welcome, register;
    private EditText email, password;
    private Button btnInter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inter = findViewById(R.id.txt_inter);
        welcome = findViewById(R.id.txt_welcome);
        register = findViewById(R.id.txt_register);
        email = findViewById(R.id.ed_email);
        password = findViewById(R.id.ed_password);
        btnInter = findViewById(R.id.btn_inter);


        btnInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().
                        equals("admin")){
                    inter.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    btnInter.setVisibility(View.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Пароль не правильный!!",
                    Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}