package com.example.proiect.Utilizatori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proiect.R;

public class CreareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creare_activity);
    }

    public void clickAnuleaza_creare(View v){
        startActivity(new Intent(this,LogareActivity.class));
    }

    public void clickCreaza(View v){

    }
}
