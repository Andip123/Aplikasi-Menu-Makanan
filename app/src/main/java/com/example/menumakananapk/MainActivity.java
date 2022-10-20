package com.example.menumakananapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dataMakanan(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Bakso daging","Bakso daging khas pemalang yang sangat legend dari tahun 1880",20000,R.drawable.baksodaging));
        listMakanan.add(new Makanan("Nasi gromyang","Nasi Gromyang makanan soto daging dengan paduan nasi",25000,R.drawable.gromysng));
        listMakanan.add(new Makanan("Lontong dekem","Lontong sayur khas pemalang dengan paduan kuah soto",20000,R.drawable.lontong));
        listMakanan.add(new Makanan("Mendoan","Tempe yang di goreng setengah matang",10000,R.drawable.mendoan));
        listMakanan.add(new Makanan("Sate Loso","sate dengan daging kerbau yang di bacem terlebih dahulu",50000,R.drawable.sateloso));
        listMakanan.add(new Makanan("Seblka Hot","Seblak jadi andalan makanan anak muda sekarang dengan rasa pedas",12000,R.drawable.seblak));
        data();
    }
    void data(){
        recMakanan = findViewById(R.id.recMenu);
        adapter = new MakananAdapter(this,listMakanan);
        layoutManager = new LinearLayoutManager(this);
        recMakanan.setLayoutManager(layoutManager);
        recMakanan.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataMakanan();

    }
}