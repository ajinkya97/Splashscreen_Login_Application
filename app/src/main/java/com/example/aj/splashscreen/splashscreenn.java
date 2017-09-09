package com.example.aj.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class splashscreenn extends AppCompatActivity {

    ProgressBar pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenn);

        pg=(ProgressBar)findViewById(R.id.progressBar);
        pg.setMax(1000);

        Thread t = new Thread() {

            public void run() {
                try {
                    for(int i=0;i<=1000;i++)
                    {
                        sleep(5);
                        pg.setProgress(i);
                    }

                    Intent i = new Intent(splashscreenn.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
            }
        };
        t.start();

    }
}
