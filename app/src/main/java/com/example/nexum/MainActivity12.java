package com.example.nexum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }

    public void openMain6(View view) {
        startActivity(new Intent(this,MainActivity6.class));
    }

    public void openMain5(View view) {
        startActivity(new Intent(this,MainActivity5.class));
    }

    public void openMain11(View view) {
        startActivity(new Intent(this,MainActivity11.class));
    }

    public void openMain14(View view) {
        startActivity(new Intent(this,MainActivity14.class));
    }
}