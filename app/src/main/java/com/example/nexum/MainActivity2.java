package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openMain3(View view) {
        startActivity(new Intent(this,MainActivity3.class));
    }

    public void openMain4(View view) {
        startActivity(new Intent(this,MainActivity4.class));
    }
}