package com.riya.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button login , SingUp , Skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

                );

             getSupportActionBar().hide();

             login = findViewById(R.id.btnlogin);
        SingUp = findViewById(R.id.btnSingUp);


        login.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                     Intent intent = new Intent(MainActivity.this , SingIn_Activity.class);
                     startActivity(intent);
                 }
             });
        SingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SingUp has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this , SingUp_Activity.class);
                startActivity(intent);
            }
        });




    }
}