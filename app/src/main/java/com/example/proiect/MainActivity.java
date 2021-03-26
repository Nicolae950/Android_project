package com.example.proiect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.proiect.Anunturi.Vizualizeaza_Activity;
import com.example.proiect.Utilizatori.LogareActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickView(View v){
        startActivity(new Intent(this, Vizualizeaza_Activity.class));
    }

    public void onClickAdd(View v){
        startActivity(new Intent(this,LogareActivity.class));
    }

}