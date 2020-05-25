package com.example.dell.covidcrisis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Admin(View view){
        Intent intent=new Intent(getApplicationContext(),Admin.class);
        startActivity(intent);
    }

    public void User(View view){
        Intent intent=new Intent(getApplicationContext(),User.class);
        startActivity(intent);
    }

    public void Registration(View view){
        Intent intent=new Intent(getApplicationContext(),Registration.class);
        startActivity(intent);
    }

  /*@Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setMessage("Do you want to exit?").setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    } */
}
