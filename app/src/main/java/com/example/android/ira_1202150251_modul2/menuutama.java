package com.example.android.ira_1202150251_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class menuutama extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        rg = findViewById(R.id.radiogroup); //untuk mengarahkan ke radio grup
    }

    public void masukindata(View view) {
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilihan = rb.getText().toString();
        switch (pilihan){
            case "Dine In":
                startActivity(new Intent(menuutama.this, dinein.class));
                Toast.makeText(menuutama.this, "Memilih Dine In", Toast.LENGTH_SHORT).show();
                break; //masuk ke laman dine in
            case "Take Away":
                startActivity(new Intent(menuutama.this, takeaway.class));
                Toast.makeText(menuutama.this, "Memilih Take Away", Toast.LENGTH_SHORT).show();
                break; //masuk ke laman takeaway
        }
    }
}