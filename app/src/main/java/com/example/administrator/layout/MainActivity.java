package com.example.administrator.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    LinearLayout linearLayout;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = 1;
        linearLayout = new LinearLayout(getApplication());
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i=0; i < 5; i++) {
            Button button = new Button(getApplicationContext());
            linearLayout.addView(button,layoutParams);
            button.setText("TEST");
        }

        button = (Button) findViewById(R.id.startFrame);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }
}
