package com.example.rplrus21.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button klik;
    TextView hasil;
    Integer number1, number2, hasilView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.edNumber1);
        num2 = (EditText) findViewById(R.id.edNumber2);
        klik = (Button) findViewById(R.id.btnKlik);
        hasil = (TextView) findViewById(R.id.txtHasil);


        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                hasilView = number1 / number2;
                hasil.setText(hasilView + "");
//                Toast.makeText(getApplicationContext(),hasilView,Toast.LENGTH_SHORT).show();
                try {
                number1 = 0;
                number2 = 0;

                } catch (ArithmeticException e) {
                Toast.makeText(getApplicationContext(),hasilView+"Cannot zero",Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
