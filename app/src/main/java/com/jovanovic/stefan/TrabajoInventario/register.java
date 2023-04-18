package com.jovanovic.stefan.TrabajoInventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void iraMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}