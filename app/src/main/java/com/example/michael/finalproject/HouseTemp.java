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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class HouseTemp extends AppCompatActivity {
    Button toastButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_temp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] houseOptions = {"View Temperature", "Set Temperature", "Make New Schedule"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, houseOptions);

        ListView listView = (ListView) findViewById(R.id.houseTemp_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) parent.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

        /*Button toastButton = (Button) findViewById(R.id.toastButton);
        final EditText editBtn = (EditText) findViewById(R.id.myEdit);
        toastButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), editBtn.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });*/
    }

}
