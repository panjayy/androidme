package com.example.panjibs.modul2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //penyimpan kondisi biar tidak berubah
        if (savedInstanceState==null){

        FragmentManager fragmentManager = getSupportFragmentManager();

        BodyPartsFragments bodyfragment;

        //membuat object head
        bodyfragment = new BodyPartsFragments();
        bodyfragment.setmImageIds(ImageAssets.getHeads());
        bodyfragment.setmListIndex(0);
        //transaksi fragment head
        fragmentManager.beginTransaction().add(R.id.heads_container, bodyfragment).commit() ;

        //membuat object bodi
        bodyfragment= new BodyPartsFragments();
        bodyfragment.setmImageIds(ImageAssets.getBodies());
        bodyfragment.setmListIndex(0);
        //transaksi fragment bodi
        fragmentManager.beginTransaction().add(R.id.bodies_container, bodyfragment).commit() ;

        //membuat object leg
        bodyfragment = new BodyPartsFragments();
        bodyfragment.setmImageIds(ImageAssets.getLegs());
        bodyfragment.setmListIndex(0);
        //transaksi fragment leg
        fragmentManager.beginTransaction().add(R.id.legs_container, bodyfragment).commit() ;
    }

    }
}
