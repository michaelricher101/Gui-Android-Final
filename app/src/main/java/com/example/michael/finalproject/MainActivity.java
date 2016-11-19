package com.example.michael.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items =
                {
                        "Temperature",
                        "Fuel",
                        "Radio",
                        "Maps",
                        "Lights",
                        "Odometer",
                        "Drive"

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
                    Intent microwave = new Intent(view.getContext(), TemperatureActivity.class);
                    startActivity(microwave);
                }
                if(position==1){
                    Intent fridge = new Intent(view.getContext(), FuelActivity.class);
                    startActivity(fridge);
                }
                if(position==2){
                    Intent light = new Intent(view.getContext(), RadioActivity.class);
                    startActivity(light);
                }
                if(position==3){
                    Intent microwave = new Intent(view.getContext(), MapsActivity.class);
                    startActivity(microwave);
                }
                if(position==4){
                    Intent fridge = new Intent(view.getContext(), LightsActivity.class);
                    startActivity(fridge);
                }
                if(position==5){
                    Intent light = new Intent(view.getContext(), OdometerActivity.class);
                    startActivity(light);
                }
                if(position==6){
                    Intent light = new Intent(view.getContext(), DriveActivity.class);
                    startActivity(light);
                }
            }
        });
    }

}
