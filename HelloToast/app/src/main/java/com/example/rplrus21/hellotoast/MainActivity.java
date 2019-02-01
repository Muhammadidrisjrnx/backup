package com.example.rplrus21.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount,mShowCount2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mShowCount2 = (TextView) findViewById(R.id.show_count2);
    }


    public void showToast(View view) {
        // Hasil dari user mengeklik tombol toast
        Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        // Hasil dari user mengeklik tombol count
        Toast.makeText(getApplicationContext(), "Hitung", Toast.LENGTH_SHORT).show();
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void countUp2(View view) {
        Toast.makeText(getApplicationContext(), "Hitung", Toast.LENGTH_SHORT).show();
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}

