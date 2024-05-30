package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    public void openMain6(View view) {
        startActivity(new Intent(this,MainActivity6.class));
    }

    public void openMain5(View view) {
        startActivity(new Intent(this,MainActivity5.class));
    }

    public void openMain12(View view) {
        startActivity(new Intent(this,MainActivity12.class));
    }

    public void openMain(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void openMain18(View view) {
        startActivity(new Intent(this,MainActivity18.class));
    }
}