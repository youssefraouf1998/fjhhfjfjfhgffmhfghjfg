package com.wds.future.fjhhfjfjfhgffmhfghjfg;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    ImageView i1 , i2 , i3 , i4 , i5 , i6 ;

    Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        i1 = findViewById(R.id.ahly);
        i2 = findViewById(R.id.barclays);
        i3 = findViewById(R.id.blom);
        i4 = findViewById(R.id.cib);
        i5 = findViewById(R.id.hsbc);
        i6 = findViewById(R.id.qnb);

        animation = AnimationUtils.loadAnimation(this, R.anim.logo_anim2);
        i1.setAnimation(animation);
        i2.setAnimation(animation);
        i3.setAnimation(animation);
        i4.setAnimation(animation);
        i5.setAnimation(animation);
        i6.setAnimation(animation);


        Thread thread = new Thread(){

            @Override
            public void run() {
                try {

                    sleep(5000);

                    Intent intent = new Intent(getApplicationContext(),Slider.class);
                    startActivity(intent);

                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();







    }

    }

