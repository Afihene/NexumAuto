package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
    }

    public void openMain19(View view) {
        startActivity(new Intent(this,MainActivity19.class));
    }

    public void openMain20(View view) {
        startActivity(new Intent(this,MainActivity20.class));
    }
}