package com.example.michael.finalproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Weather extends AppCompatActivity {
    public Toast toast;
    Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String[] weatherOptions = {"See Outside Weather"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, weatherOptions);

        ListView listView = (ListView) findViewById(R.id.weather_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) parent.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

//        Button toastButton = (Button) findViewById(R.id.toastButton);
//
//        toastButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Toast.makeText(getBaseContext(), "This is my button", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
