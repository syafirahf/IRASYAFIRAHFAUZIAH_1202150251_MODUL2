package com.example.android.ira_1202150251_modul2;

public class pilihanmenu {
    int gambar;
    String nama;
    int harga;
    String komposisi;

    public pilihanmenu(int gambar, String nama, int harga, String komposisi) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getGambar() {
        return gambar;
    } //agar dapat menampilkan gambar

    public String getNama() {
        return nama;
    } // agar dapat menampilkan nama

    public int getHarga() {
        return harga;
    } // agar dapat menampilkan harga

    public String getKomposisi(){ // agar dapat menampilkan komposisinya
        return komposisi;}
} // class ini digunakan untuk get semua komponen dari menu