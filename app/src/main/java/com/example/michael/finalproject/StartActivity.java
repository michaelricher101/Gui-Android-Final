package com.example.michael.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        String[] items =
                {
                        "Microwave",
                        "Fridge",
                        "Main Light"

                };
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = (String) adapterView.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), value + " in Action", Toast.LENGTH_SHORT).show();

                if(position==0){
                    Intent microwave = new Intent(view.getContext(), microwave.class);
                    startActivity(microwave);
                }
                if(position==1){
                    Intent fridge = new Intent(view.getContext(), fridge.class);
                    startActivity(fridge);
                }
                if(position==2){
                    Intent light = new Intent(view.getContext(), mainlight.class);
                    startActivity(light);
                }
            }
        });
}
}
