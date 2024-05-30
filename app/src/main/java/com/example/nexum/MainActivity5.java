package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void openMain6(View view) {
        startActivity(new Intent(this, MainActivity6.class));
    }


    public void openMain7(View view) {
        startActivity(new Intent(this, MainActivity7.class));
    }


    public void openMain11(View view) {
        startActivity(new Intent(this, MainActivity11.class));
    }

    public void openMain12(View view) {
        startActivity(new Intent(this,MainActivity12.class));
    }
}