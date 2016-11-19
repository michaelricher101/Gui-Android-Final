package com.example.michael.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        Button chrisBut = (Button) findViewById(R.id.launchKrist);
        chrisBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this , SettingOverviewActivity.class);
                startActivity(intent);

            }
        });
        Button karabut = (Button) findViewById(R.id.launchKara);
        karabut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this , MainActivity.class);
                startActivity(intent);

            }
        });

        Button mikeBut = (Button) findViewById(R.id.LaunchMike);
        mikeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this , livingRoom.class);
                Log.d("click", "in on click");
                startActivity(intent);

            }
        });





    }
}
