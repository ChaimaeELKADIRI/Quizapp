package com.example.quzapp_elkadiri;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText etMail, etPassword, etPassword1;
    Button bRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        etMail=(EditText) findViewById(R.id.etMail);
        etPassword=(EditText) findViewById(R.id.etPasswd);
        etPassword1=(EditText)findViewById(R.id.etConfirmPasswd);
        bRegister=(Button)findViewById(R.id.bRegister);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=etMail.getText().toString();
                String password=etPassword.getText().toString();
                String password1=etPassword1.getText().toString();
                if(TextUtils.isEmpty(mail)){
                    Toast.makeText(getApplicationContext(),"Veuillez inserer votre adresse",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(),"Veuillez inserer votre mdp",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password1)){
                    Toast.makeText(getApplicationContext(),"Veuillez confirmer votre mdp",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length()<4){
                    Toast.makeText(getApplicationContext(),"Votre mdp doit contenir au moins 4 caracteres",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals(password1)){
                    Toast.makeText(getApplicationContext(),"Mdp invalid, reessayer",Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(getApplicationContext(),"Inscription réussie! ",Toast.LENGTH_LONG).show();
                startActivity(new Intent(Register.this,MainActivity.class));
                finish();
            }
        });
    }
}