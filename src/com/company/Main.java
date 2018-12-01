package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("Nimesil", "Laboratorios Menarini S.A.",
                10.99,30, 1, 3, "2017/10/10");
        ArrayList <Pharmacy> dataBase = new ArrayList<>();
        dataBase.add(first);
        for (Pharmacy s: dataBase) {
            System.out.println(s);
        }
        
//        Date dateOfDelivery = new Date("2017/10/10");
//        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println(df.format(dateOfDelivery));
    }
}