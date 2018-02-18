package com.example.android.ira_1202150251_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    RecyclerView rv;
    menuadapter adapter;
    List<pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); //untuk menyambungkan class menu dengan layoutnya
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this)); //untuk mengeset layout
        initdata();
    }
    private void initdata(){
        listmenu.add(new pilihanmenu(R.drawable.taiyaki, "Taiyaki Ice Cream", 15000, "Cone ikan, Ice Cream, Toping"));
        listmenu.add(new pilihanmenu(R.drawable.takoyaki, "Takoyaki", 20000, "Tepung, gurita, telor, daun bawang, katsuobushi, bumbu teriyaki"));
        listmenu.add(new pilihanmenu(R.drawable.okonomiyaki, "Okonomiyaki", 25000, "Tepung, Telor, Daun bawang, kol, daging"));
        listmenu.add(new pilihanmenu(R.drawable.donkatsu, "Donkatsu", 25000, "daging, tepung terigu, tepung roti, bawang, bumbu teriyaki"));
        listmenu.add(new pilihanmenu(R.drawable.shrimp, "Shrimproll", 15000, " udang, Kol, Wortel, Jagung, kulit pangsit"));
        adapter = new menuadapter(this, listmenu);
        rv.setAdapter(adapter); // untuk memunculkan gambar, nama dan juga komposisi dari menu yang ada
    }
}