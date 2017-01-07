package com.example.administrator.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Main2Activity extends Activity {

    FrameLayout frameLayout;
    ImageView imageView1;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        frameLayout = (FrameLayout) findViewById(R.id.activity_main2);
        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);

        imageView1.setImageResource(R.drawable.img1);
        imageView2.setImageResource(R.drawable.img3);

        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageView1.getVisibility() == View.VISIBLE) {
                    showIMG2();
                } else {
                    showIMG1();
                }
            }
        });

    }


    public void showIMG1() {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
    }

    public void showIMG2() {
        imageView2.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
    }
}
