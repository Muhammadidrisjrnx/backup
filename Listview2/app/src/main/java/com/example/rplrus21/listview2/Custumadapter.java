package com.example.rplrus21.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RPLRUS21 on 30-Jan-18.
 */

public class Custumadapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    String[] namaGlobal={};


    public Custumadapter(String[] nama,Context context){
        layoutInflater = LayoutInflater.from(context);
        namaGlobal=nama;
    }

    //variable local dan global
    //apa itu class dan object
    //constructor

    @Override
    public int getCount() {
        return namaGlobal.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= layoutInflater.inflate(R.layout.layoutpage, null);
        TextView tvnama=(TextView) convertView.findViewById(R.id.txtnama);
        tvnama.setText(namaGlobal[position]);

        ImageView logo=(ImageView)convertView.findViewById(R.id.logoUser);
        logo.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }
}
