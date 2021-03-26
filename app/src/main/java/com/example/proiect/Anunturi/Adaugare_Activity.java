package com.example.proiect.Anunturi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proiect.MainActivity;
import com.example.proiect.R;
import com.example.proiect.Utilizatori.LogareActivity;

public class Adaugare_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adaugare_anunt);

    }

    public void clickAdaugare(View v){
        startActivity(new Intent(this, LogareActivity.class));
    }

    public void clickAnuleaza(View v){
        startActivity(new Intent(this,MainActivity.class));
    }
}
