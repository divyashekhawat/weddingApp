package com.example.freeapp.weddingapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by vinove on 2/11/16.
 */
public class Invitation extends AppCompatActivity{
    TextView tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invitation);
        tv1=(TextView)findViewById(R.id.textview1);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/DancingScript-Bold.ttf");
        tv1.setTypeface(face);
     }
}
