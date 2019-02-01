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

public class Main3Activity extends AppCompatActivity {
Button simpna;
    EditText nama , user , pass;
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
        setContentView(R.layout.activity_main3);
        nama = (EditText) findViewById(R.id.name);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        keluar = (Menu) findViewById(R.id.action_settings);
        simpna = (Button) findViewById(R.id.save);
        simpna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
