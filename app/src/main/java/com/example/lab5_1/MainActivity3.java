package com.example.lab5_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClickWar(View v)
    {
        EditText h1 = (EditText)findViewById(R.id.editTextNumberDecimal);
        EditText h2 = (EditText)findViewById(R.id.editTextNumberDecimal3);
        EditText m1 = (EditText)findViewById(R.id.editTextNumberDecimal2);
        EditText m2 = (EditText)findViewById(R.id.editTextNumberDecimal4);

        TextView resText=(TextView)findViewById(R.id.textView15);

        int hh1= Integer.parseInt(h1.getText().toString());
        int hh2= Integer.parseInt(h2.getText().toString());
        int mm1= Integer.parseInt(m1.getText().toString());
        int mm2= Integer.parseInt(m2.getText().toString());

        switch (v.getId())
        {
            case R.id.button:
                LocalTime time = LocalTime.of(hh1, mm1);
                LocalTime newTime = time.plusHours(hh2).plusMinutes(mm2);
                resText.setText(newTime+"");
                break;
            case R.id.button2:
                LocalTime time1 = LocalTime.of(hh1, mm1);
                LocalTime newTime1 = time1.minusHours(hh2).minusMinutes(mm2);
                resText.setText(newTime1+"");
                break;

            default:
                break;
        }}
}