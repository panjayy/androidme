package com.example.panjibs.modul2;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {

    //Variabel ini adalah pengelompokan untuk head , dan menyimpan data
    private static List<Integer> heads= new ArrayList<Integer>(){{
        add(R.drawable.head1);
        add(R.drawable.head2);
        add(R.drawable.head3);
        add(R.drawable.head4);
        add(R.drawable.head5);
        add(R.drawable.head6);
        add(R.drawable.head7);
        add(R.drawable.head8);
        add(R.drawable.head9);
        add(R.drawable.head10);
        add(R.drawable.head11);
        add(R.drawable.head12);
        }};

    //Variabel ini adalah pengelompokan untuk bodi , dan menyimpan data
    private  static  List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);
        add(R.drawable.body7);
        add(R.drawable.body8);
        add(R.drawable.body9);
        add(R.drawable.body10);
        add(R.drawable.body11);
        add(R.drawable.body12);
    }};

    //Variabel ini adalah pengelompokan untuk kaki , dan menyimpan data
    private  static  List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);
        add(R.drawable.legs5);
        add(R.drawable.legs6);
        add(R.drawable.legs7);
        add(R.drawable.legs8);
        add(R.drawable.legs9);
        add(R.drawable.legs10);
        add(R.drawable.legs11);
        add(R.drawable.legs12);
    }};

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel head
    public static List<Integer> getHeads(){
        return heads;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel body
    public static List<Integer> getBodies(){
        return bodies;
    }

    //ini adalah method yang digunakan untuk mengambil/memanggil variabel leg
    public static List<Integer> getLegs(){
        return legs;
    }


}
