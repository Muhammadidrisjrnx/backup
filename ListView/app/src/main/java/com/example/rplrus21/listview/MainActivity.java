package com.example.rplrus21.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView daftar;

    int [] images = new int[]{R.drawable.tambah,R.drawable.kurang,R.drawable.kali,R.drawable.bagi,R.drawable.logo};
    String  [] operasi = new String[]{"Tambah", "Kurang", "Kali", "Bagi","RPL"};
    String [] deskripsi = new String[]{"cara penambahan","cara pengurangan","cara perkalian","cara pembagian","Adalah jurusan Rekayasa Perangkat Lunak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    daftar = (TextView) findViewById(R.id.tamp);
    ListView tampilan = (ListView) findViewById(R.id.file);
    CustomAdapter custom_adapter = new CustomAdapter();
        tampilan.setAdapter(custom_adapter);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textview = (TextView) view.findViewById(R.id.textView);
            TextView textview2=(TextView) view.findViewById(R.id.textView2);

            imageView.setImageResource(images[i]);
            textview.setText(operasi[i]);
            textview2.setText(deskripsi[i]);
            return  view;
        }
    }
}
