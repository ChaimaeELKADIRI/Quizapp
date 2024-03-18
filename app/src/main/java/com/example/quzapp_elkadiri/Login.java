package com.example.quzapp_elkadiri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText etMail, etPasswd;
    Button bLogin;
    TextView tvRegister;
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.login);
        etMail=(EditText) findViewById(R.id.etMail);
        etPasswd=(EditText) findViewById(R.id.etPasswd);
        bLogin=(Button) findViewById(R.id.bLogin);
        tvRegister=(TextView) findViewById(R.id.tvRegister);
        bLogin.setOnClickListener((view)->{
            if(etMail.getText().toString().equals("toto@gmail.com") && etPasswd.getText().toString().equals(123)){
                startActivity(new Intent(Login.this, Register.class));
            }
            else{
                Toast.makeText(getApplicationContext(),"Login or password incorrect!",Toast.LENGTH_SHORT).show();
            }
        });
        tvRegister.setOnClickListener((view)->{
            startActivity(new Intent(Login.this, Register.class));
        });
    }
}
