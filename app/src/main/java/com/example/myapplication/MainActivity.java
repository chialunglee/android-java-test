package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        System.out.println("Hello world!");
//        EditText user = (EditText) findViewById(R.id.user);
//        EditText password = (EditText) findViewById(R.id.password);
//        Log.i("User", user.getText().toString());
//        Log.i("Password", password.getText().toString());
//        Toast.makeText(this, "Hello " + user.getText().toString(), Toast.LENGTH_LONG).show();
    }
}