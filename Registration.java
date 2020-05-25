package com.example.dell.covidcrisis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Registration extends AppCompatActivity {
    EditText name,pwd,email,phn,loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void reg(View view) {
        name = (EditText) findViewById(R.id.name);
        pwd = (EditText) findViewById(R.id.pwd);
        email = (EditText) findViewById(R.id.email);
        phn = (EditText) findViewById(R.id.phn);
        loc = (EditText) findViewById(R.id.loc);

        Toast.makeText(getApplicationContext(),"Registration Success",Toast.LENGTH_LONG).show();
        Intent i=new Intent(getApplicationContext(),Registration.class);
        startActivity(i);

    }


    }

