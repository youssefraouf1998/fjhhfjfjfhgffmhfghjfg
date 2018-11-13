package com.wds.future.fjhhfjfjfhgffmhfghjfg;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Slider extends AppCompatActivity {

    ViewFlipper viewFlipper ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        viewFlipper = findViewById(R.id.view_flipper_layout_2);

        int images_flippers_resource_2 []= {R.drawable.ahly , R.drawable.cib
                , R.drawable.bloom , R.drawable.qnb , R.drawable.hsbc , R.drawable.barclays };


        for(int images_flippers2 : images_flippers_resource_2){
            flipperImages2(images_flippers2);

        }

    }

    public void flipperImages2(int images2) {
        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(images2);
        viewFlipper.addView(imageView2);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }

}
