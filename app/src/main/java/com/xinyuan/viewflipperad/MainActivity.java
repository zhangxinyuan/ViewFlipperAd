package com.xinyuan.viewflipperad;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.vflipper);
        TextView textView = new TextView(this);
        textView.setText("阿里巴巴倒闭了！\n李彦宏发微博庆祝");
        textView.setTextSize(30);
        textView.setTextColor(Color.BLUE);

        TextView textView1 = new TextView(this);
        textView1.setText("阿里巴巴上市了！\n张家辉哭了？！是人性的扭曲还是道德的沦丧？");
        textView1.setTextSize(30);
        textView1.setTextColor(Color.RED);

        viewFlipper.addView(textView1);
        viewFlipper.addView(textView);
    }
}
