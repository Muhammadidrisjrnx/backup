package com.example.rplrus21.myapplication;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;



public class MainActivity extends AppCompatActivity {
    TextView hasil;
    Button btnhitung, btnhapus;
    EditText angka1 , angka2;
    Spinner buka;
    DrawerLayout Drawerlayout;
    Menu exit;
    MaterialBetterSpinner desain;
    String[] SPINNERLIST = {"Tambah", "Kurang", "Kali", "Bagi"};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }
    public boolean onNavigationViewListener(MenuItem item)
    {
        @Override
        public void onNavigationItemSelected(MenuItem item) {



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerlayout);

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                moveTaskToBack(true);
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hasil = (TextView) findViewById(R.id.hasil);
        btnhitung  = (Button) findViewById(R.id.btn);
        angka1 = (EditText) findViewById(R.id.txtawal);
        angka2 = (EditText) findViewById(R.id.txttengah);
        desain = (MaterialBetterSpinner) findViewById(R.id.spinner);
        exit = (Menu) findViewById(R.id.action_settings);
        btnhapus = (Button) findViewById(R.id.hapus);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        desain.setAdapter(arrayAdapter);



        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String a = angka1.getText().toString();

                String b = angka2.getText().toString();



                if  (a.equals("")&& b.equals("") )
                {
                    Toast.makeText(getApplicationContext(),"Harap isi Angka Pertama , Angka Kedua ",Toast.LENGTH_SHORT).show();
                }
                else if (a.equals("")) {
                    Toast.makeText(getApplicationContext(), "Harap isi Angka Pertama", Toast.LENGTH_SHORT).show();
                }
                else if (b.equals("")) {
                    Toast.makeText(getApplicationContext(), "Harap isi Angka Kedua", Toast.LENGTH_SHORT).show();
                }

                else if (desain.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Pilih Operasi Hitung", Toast.LENGTH_SHORT).show();
                }

                else if (desain.getText().toString().equalsIgnoreCase("Tambah")) {


                    int awal = Integer.parseInt(angka1.getText().toString());

                    int akhir = Integer.parseInt(angka2.getText().toString());

                    int hasil2 = awal + akhir;

                    hasil.setText(hasil2 + "");

                } else if (desain.getText().toString().equalsIgnoreCase("Kurang")) {
                    int awal = Integer.parseInt(angka1.getText().toString());

                    int akhir = Integer.parseInt(angka2.getText().toString());

                    int hasil2 = awal - akhir;

                    hasil.setText(hasil2 + "");

                } else if (desain.getText().toString().equalsIgnoreCase("Kali")) {
                    int awal = Integer.parseInt(angka1.getText().toString());

                    int akhir = Integer.parseInt(angka2.getText().toString());

                    int hasil2 = awal * akhir;

                    hasil.setText(hasil2 + "");



                } else if (desain.getText().toString().equalsIgnoreCase("Bagi")) {
                    int awal = Integer.parseInt(angka1.getText().toString());

                    int akhir = Integer.parseInt(angka2.getText().toString());

                    int hasil2 = awal / akhir;

                    hasil.setText(hasil2 + "");


                }

                btnhapus.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View v) {
                        hasil.setText("0");
                    }


                });


            };
            });


    }

}

