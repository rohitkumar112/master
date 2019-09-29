package com.example.rohit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void fun()
    {
        System.out.println("This is second push i am doning");
    }
    private void sum()
    {
        System.out.println("push from rohit");
    }

}
