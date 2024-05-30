package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void openMain5(View view) {
        startActivity(new Intent(this,MainActivity5.class));
    }

    public void openMain8(View view) {
        startActivity(new Intent(this,MainActivity8.class));
    }

    public void openMain9(View view) {
        startActivity(new Intent(this,MainActivity9.class));
    }


    public void openMain11(View view) {
        startActivity(new Intent(this,MainActivity11.class));
    }


    public void openMain12(View view) {
        startActivity(new Intent(this,MainActivity12.class));
    }

    public void openMain13(View view) {
        startActivity(new Intent(this,MainActivity13.class));
    }
}