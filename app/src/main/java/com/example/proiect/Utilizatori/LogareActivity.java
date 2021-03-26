package com.example.proiect.Utilizatori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proiect.Anunturi.Adaugare_Activity;
import com.example.proiect.R;

public class LogareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logare_activity);
    }

    public void clickLOG_IN(View v){
        if(autentificare()){
            startActivity(new Intent(this, Adaugare_Activity.class));
        }
    }

    public void clickCREAZA_CONT(View v){
        startActivity(new Intent(this,CreareActivity.class));
    }

    protected boolean autentificare(){
        return true;
    }
}
