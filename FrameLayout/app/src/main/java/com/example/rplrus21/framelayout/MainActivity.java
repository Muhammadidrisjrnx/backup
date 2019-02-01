package com.example.rplrus21.framelayout;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView kotak, persegi, segitiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    kotak= (ImageView) findViewById(R.id.imageViewkotak);
        persegi= (ImageView) findViewById(R.id.imageViewpersegipanjang);
        segitiga= (ImageView) findViewById(R.id.imageViewsegitiga);

    }

}
