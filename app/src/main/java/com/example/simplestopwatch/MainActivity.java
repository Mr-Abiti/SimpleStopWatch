package com.example.simplestopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int second;  //the amount of second passed
    private boolean running;  //check whether time is running or not

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTime(View view){
        running = true;

    }
    public void stopTime(View view){
        running = false;

    }
    public void resetTime(View view){
        running = false;
        second = 0;

    }
}
