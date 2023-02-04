package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sendNow(View view){
        Toast.makeText(this, "Sending Your Data...", Toast.LENGTH_SHORT).show();
    }
    public void corruptNow(View view){
        Toast.makeText(this, "Corrupting Your Device...", Toast.LENGTH_SHORT).show();
    }
    public void stopNow(View view){
        Toast.makeText(this, "Something Went Wrong...", Toast.LENGTH_SHORT).show();
    }
    public void nextpage(View view){
        Toast.makeText(this, "Opening Next Page", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,layout2.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}