package com.example.android.ira_1202150251_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splash extends AppCompatActivity {
    private static int splashInterval = 2000;
    //untuk interval splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(splash.this, menuutama.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(splash.this,"IRASYAFIRAHFAUZIAH_1202150251", Toast.LENGTH_LONG).show();
                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);
    };
}