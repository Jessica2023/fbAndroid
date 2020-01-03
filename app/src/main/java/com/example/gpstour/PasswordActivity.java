package com.example.gpstour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordActivity extends AppCompatActivity {

    String email;
    EditText e2_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        e2_pass = (EditText)findViewById(R.id.RegPass);

        Intent myIntent01 = getIntent();
        if(myIntent01 != null){
            email = myIntent01.getStringExtra("email");
        }
    }

    public  void irPerfil(View v){
        if(e2_pass.getText().toString().length() >6 ){
            Intent myIntent = new Intent(PasswordActivity.this, PerfilActivity.class);
            myIntent.putExtra("email", email);
            myIntent.putExtra("password", e2_pass.getText().toString());
            startActivity(myIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "La contraseña debe ser mayor a 6 caracteres", Toast.LENGTH_LONG).show();

        }


    }
}
