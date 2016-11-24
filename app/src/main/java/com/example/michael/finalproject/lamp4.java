package com.example.michael.finalproject;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;

public class lamp4 extends AppCompatActivity {

    protected TextView space;
    protected EditText red ;
    protected EditText blue;
    protected  EditText green ;
    protected ProgressBar prog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp4);
        space = (TextView) findViewById(R.id.lamp4_color);
        red = (EditText) findViewById(R.id.lamp4_editRed);
        blue = (EditText) findViewById(R.id.lamp4_editblue);
        green = (EditText) findViewById(R.id.lamp4_editgreen);
        final  Button calc = (Button) findViewById(R.id.lamp4_calc);
        prog = (ProgressBar) findViewById(R.id.lamp4_prog);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prog.setVisibility(View.VISIBLE);
                Log.d("button", "In button perss");
                LongOperation temp = new LongOperation();
                temp.execute("test");

            }
        });

    }
    private class LongOperation extends AsyncTask<String, Integer, String> {

        private Integer hexr = 0;
        private Integer hexb = 0;
        private Integer hexg = 0;
        private String hexCode ;

        public LongOperation()
        {}

        @Override
        protected String doInBackground(String... params) {

            String hexCode ;

            if(hexr <0 || hexr > 255 ) {
                hexr = -1;
            }
            publishProgress(33);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
            if(hexb <0 || hexb > 255)
            {
                hexb = -1;
            }
            publishProgress(66);

            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
            if(hexg <0 || hexg > 255)
            {
                hexg = -1;
            }
            publishProgress(99);

            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            if(hexr ==-1 || hexb == -1 || hexg == -1)
            {
                // do nothing since invalid data
            }
            else
            {
                Log.d("??", "In else setting BG" + hexr + hexb + hexg);
                space.setBackgroundColor(Color.rgb(hexr,hexg,hexb));
                prog.setVisibility(View.INVISIBLE);

            }


        }

        @Override
        protected void onPreExecute() {
            prog.setBackgroundColor(Color.BLACK);
            try {
                hexr = Integer.parseInt(red.getText().toString());
                Log.d("lamp4", "In first try");
            }catch(Exception e)
            {
                prog.setBackgroundColor(Color.RED);
                prog.setProgress(100);
                hexr = -1;

            }
            try {
                hexb = Integer.parseInt(blue.getText().toString());
                Log.d("lamp4", "In second try");

            }catch(Exception e)
            {
                prog.setBackgroundColor(Color.RED);
                prog.setProgress(100);
                hexb = -1;
            }
            try {
                hexg = Integer.parseInt(green.getText().toString());
                Log.d("lamp4", "In third try");

            }catch(Exception e)
            {
                prog.setBackgroundColor(Color.RED);
                prog.setProgress(100);
                hexg = -1;
            }

        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            prog.setVisibility(View.VISIBLE);
            prog.setProgress(values[0]);
        }
    }


}
