package com.neighbourhood.neighbouthood;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            Intent startMain = new Intent(SplashActivity.this, SignInOptionsActivity.class);
            startActivity(startMain);
            finish();
        };
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {

                    Thread.sleep(5000);
                    Message msgObj = handler.obtainMessage();



                    handler.sendMessage(msgObj);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
