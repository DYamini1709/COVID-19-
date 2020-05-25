package com.example.dell.covidcrisis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
    EditText name,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }


    public void login(View view){

        name= (EditText) findViewById(R.id.name);
        pwd= (EditText) findViewById(R.id.pwd);
        if(name.getText().toString().equals("") || pwd.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Enter Credentials", Toast.LENGTH_LONG).show();
        }else if(name.getText().toString().equalsIgnoreCase("admin") || pwd.getText().toString().equalsIgnoreCase("admin")){
            Intent intent=new Intent(getApplicationContext(),Admin.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
        }

    }
}
