package com.example.michael.finalproject;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class microwave extends AppCompatActivity {

    Handler ahandler;
    Handler ahandler01;
    TextView aTextview;
    Button Btn_start;
    Button Btn_stop;
    Button Btn_restart;
    Button aButton01;
    EditText aEditText;
    EditText aEditText01;
    ImageView imageView;
    Boolean checker=false;
    int count=11;
    int count01=11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_microwave);
    }}

