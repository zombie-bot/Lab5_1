package com.example.lab5_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalTime;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClickCivil(View v)
    {
        EditText h1 = (EditText)findViewById(R.id.editTextNumberDecimal96);
        EditText h2 = (EditText)findViewById(R.id.editTextNumberDecimal99);
        EditText m1 = (EditText)findViewById(R.id.editTextNumberDecima97);
        EditText m2 = (EditText)findViewById(R.id.editTextNumberDecimal98);

        EditText amPM = (EditText)findViewById(R.id.editTextTextPersonName);

        TextView resText=(TextView)findViewById(R.id.textView99);

        int hh1= Integer.parseInt(h1.getText().toString());
        int hh2= Integer.parseInt(h2.getText().toString());
        int mm1= Integer.parseInt(m1.getText().toString());
        int mm2= Integer.parseInt(m2.getText().toString());

        String amPm=amPM.getText().toString();

        switch (v.getId())
        {
            case R.id.button98:

                int hhNew = hh1 + hh2;
                int mmNew = mm1 + mm2;

                if (mmNew>=60){  hhNew+=1; mmNew%=60; if (hhNew>12){  hhNew=hhNew-12; if(amPm.equals("am")) { amPm="pm"; } else if (amPm.equals("pm")) {amPm="am"; }}
            }
                resText.setText(hhNew+":"+mmNew+" "+amPm);
                break;

            case R.id.button99:

                int hhNew1 = hh1 - hh2;
                int mmNew1 = mm1 - mm2;

                if (mmNew1<0) { mmNew1=Math.abs(mmNew1); hhNew1=-1;}
                if(hhNew1<0) { hhNew1=Math.abs(hhNew1); if(amPm.equals("am")) { amPm="pm"; } else if (amPm.equals("pm")) {amPm="am"; }}


                resText.setText(hhNew1+":"+mmNew1+" "+amPm);
                break;
            default:
                break;
        }}
}