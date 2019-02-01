package com.example.rplrus21.listview2;

import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //int[] image = {R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round};
    String[] nama = {"Farid", "Firman", "Aldi", "Andrian", "Annisa", "Anjas", "Dhamar", "Fahris", "Istiqomah", "Jelita", "Firda", "Anam", "Julian", "Rivaldi", "Ricardo", "Miftah", "Fahri", "Ghofur", "Putra", "Idris", "Musenda", "Nauval", "Noor", "Risa", "Rufiah", "Sena", "Syukron", "Tirta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listkontak = (ListView) findViewById(R.id.kontak);

        Custumadapter adapterkontak=new Custumadapter(nama,MainActivity.this);

        listkontak.setAdapter(adapterkontak);

    }


}
