package com.example.david.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edusuario, edpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edusuario=(EditText)findViewById(R.id.edusuario);
        edpassword=(EditText)findViewById(R.id.edpassword);



    }//Fin del oncreate


    public void registrarusuario (View view){

        String usuario = edusuario.getText().toString();
        String password = edpassword.getText().toString();

        if(usuario.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(),"Rellena todos los campos",Toast.LENGTH_LONG).show();
        }else{
            Intent i=new Intent(getApplicationContext(),MenuprincipalActivity.class);
            startActivity(i);
        }


        }



    public void logear (View view){

        Intent i=new Intent (getApplicationContext(),registroActivity.class);
        startActivity(i);







    }

}//Fin del main
