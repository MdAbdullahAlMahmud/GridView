package com.example.asif.day12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.GridView;

import com.example.asif.day12.Adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] value;
    int[] img={R.drawable.instagram,R.drawable.facebooklogo1,R.drawable.twitter,R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid= findViewById(R.id.gridView);

        String[] value= getResources().getStringArray(R.array.icon_name);
        CustomAdapter gridview= new CustomAdapter(this,value,img);
        grid.setAdapter(gridview);
    }
}
