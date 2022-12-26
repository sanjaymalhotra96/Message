package com.example.sendmessage;


import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MyMessage {

        public static void MyMessagee(Context context, String msg){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();

    }
}