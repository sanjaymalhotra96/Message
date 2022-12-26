package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sendmessage.MyMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMessage.MyMessagee(this,"hello my message");
    }
}