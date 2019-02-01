package com.example.rplrus21.loginapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rplrus21.loginapp.R.layout;

public class MainActivity extends AppCompatActivity {

    Button lanjut , daftar;
    EditText user, pass;
    Menu keluar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;

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
        daftar = (Button) findViewById(R.id.btn2);
        lanjut = (Button) findViewById(R.id.btn);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        keluar = (Menu) findViewById(R.id.action_settings);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = user.getText().toString();
                String b = pass.getText().toString();
                if (a.equalsIgnoreCase("aku")&&b.equalsIgnoreCase("saya"))
                {
                    Toast.makeText(getApplicationContext(),"Selamat Anda berhasil Masuk",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                else if (a.equals("")&&b.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Isi Username dan Password",Toast.LENGTH_SHORT).show();
                }
                else if (a.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Isi Username",Toast.LENGTH_SHORT).show();
                }
                else if (b.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Isi Password",Toast.LENGTH_SHORT).show();
                }
                else if (moveTaskToBack(true))
                {
                    Toast.makeText(getApplicationContext(),"Salah",Toast.LENGTH_LONG).show();
                }

            }

        });
            daftar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent);

                }
            });

    }
}