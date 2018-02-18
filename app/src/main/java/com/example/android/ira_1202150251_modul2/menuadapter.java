package com.example.android.ira_1202150251_modul2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;


public class menuadapter  extends RecyclerView.Adapter<menuadapter.menuholder>{
    CardView cd;
    private Context context;
    private List<pilihanmenu> menu;

    public menuadapter(Context context, List<pilihanmenu> menu) {
        this.context = context;
        this.menu = menu;
    }

    @Override
    public menuholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cardview_menu, parent, false);
        menuholder holder  = new menuholder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(menuholder holder, int position) {
        pilihanmenu data = menu.get(position);
        holder.gambar.setImageDrawable(context.getResources().getDrawable(data.getGambar()));
        holder.gambar.setTag(data.getGambar());
        holder.nama.setText(data.getNama());
        holder.nama.setTag(data.getKomposisi());
        holder.harga.setText("Harga : Rp. "+ NumberFormat.getInstance(Locale.US).format(data.getHarga()));
    } // untuk mengeset data menu dan detailnya

    @Override
    public int getItemCount() {
        return menu.size();
    }

    class menuholder extends RecyclerView.ViewHolder{
        ImageView gambar;
        TextView nama, harga;
        public menuholder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar_menu);
            nama = itemView.findViewById(R.id.nama_menu);
            harga = itemView.findViewById(R.id.harga_menu);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { //agar saat sebuah menu di click akan muncul keterangan lengkap
                    Intent pindah = new Intent(context, detail.class);
                    pindah.putExtra("nama", nama.getText());
                    pindah.putExtra("harga", harga.getText());
                    pindah.putExtra("komposisi", nama.getTag().toString());
                    pindah.putExtra("gambar", gambar.getTag().toString());
                    context.startActivity(pindah);
                }
            });
        }
    }
}
