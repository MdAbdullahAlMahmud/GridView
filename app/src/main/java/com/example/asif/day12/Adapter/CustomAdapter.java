package com.example.asif.day12.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asif.day12.R;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] value;
    int [] img;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] value, int[] img) {
        this.context = context;
        this.value = value;
        this.img = img;
    }


    @Override
    public int getCount() {
        return value.length;
    }

    @Override
    public Object getItem(int position) {
        return img[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (convertView==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.row_layout, parent, false);
            }
            TextView tv= view.findViewById(R.id.tv);
            ImageView image= view.findViewById(R.id.im);
            tv.setText(value[position]);
            image.setImageResource(img[position]);


        return view;
    }
}
