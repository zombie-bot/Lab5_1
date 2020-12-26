package com.example.lab5_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.LocalTime;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick(View v)
    {
    switch (v.getId())
    {
        case R.id.btnActTwo:
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
                break;
        case R.id.btnActThree:
            Intent intent1 = new Intent(this, MainActivity3.class);
            startActivity(intent1);
            break;
        case R.id.btnActFour:
            Intent intent2 = new Intent(this, MainActivity4.class);
            startActivity(intent2);
            break;
            default:
                break;
    }}

}