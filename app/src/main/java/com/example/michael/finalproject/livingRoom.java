package com.example.michael.finalproject;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class livingRoom extends AppCompatActivity {
    protected final ArrayList<String> listWin = new ArrayList<String>();
    protected final String[] lampList={"Lamp1","Lamp2","Lamp3"};
    protected final boolean[] lampSelected = {false,false,false};
    protected int test = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("In created class", "WTF");
        setContentView(R.layout.activity_living_room);
        String[] lampList={"Lamp1","Lamp2","Lamp3"};
        listAdapter myAdapter=new listAdapter(this);
        ListView myList = (ListView) findViewById(R.id.listwin);
        myList.setAdapter(myAdapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent lamp1 = new Intent(view.getContext(), lamp2.class);
                    startActivity(lamp1);
                }
                if(i==1){
                    Intent lamp2 = new Intent(view.getContext(), lamp3.class); //had an error with lamp 1 so had to move everything up one
                    startActivity(lamp2);
                }
                if(i ==2){
                    Intent lamp3 = new Intent(view.getContext(), lamp4.class); //had an error with lamp 1 so had to move everything up one
                    Log.d("In on click lamp3" , "WTF");
                    startActivity(lamp3);
                }


            }
        });


    }
    //inner class
    class listAdapter extends ArrayAdapter<String> {

        public listAdapter(Context ctx){
            super(ctx,0);
        }

        public int getCount(){
            return lampList.length;
        }

        public String getItem(int position){
            return lampList[position];
        }



        public View getView(int position, View convertView,ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            View result =null;


            if(lampSelected[position])
            {
                result = inflater.inflate(R.layout.content_lamp2, null);
                lampSelected[position] = !lampSelected[position];
            }
            else
            {
                result = inflater.inflate(R.layout.simple_list_item_1, null);
            }
            TextView message = (TextView)result.findViewById(R.id.textView);
            message.setText(getItem(position));
            return result;
        }



    }



}