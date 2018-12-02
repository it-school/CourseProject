package com.company;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    private static ArrayList <Pharmacy> dataBase = new ArrayList<>();

    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("Nimesil", "Laboratorios Menarini S.A.",
                10.99,30, 1, 3, "2017/10/10");
        dataBase.add(first);
        for (Pharmacy s: dataBase) {
            System.out.println(s);
        }

//        Date dateOfDelivery = new Date("2017/10/10");
//        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println(df.format(dateOfDelivery));

    }

    static void deleteAllExpiredDrugs () {
        Date todayDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        ParsePosition parsePosition = new ParsePosition(0);

        for (Pharmacy pharmacy: dataBase) {
            Date expired = dateFormat.parse(pharmacy.getDate(), parsePosition); // превращает строку из getDate() в объект класса Date
            if (todayDate.compareTo(expired) >= pharmacy.getShelfLife()) {
                dataBase.remove(dataBase.indexOf(pharmacy));
            }
        }
    }

    static void displayDrugs () {
        for (Pharmacy pharmacy: dataBase) {
            if (pharmacy.getInPackage() >= 100) {
                System.out.println(pharmacy.getDrugName());
            }
        }
    }
    static void displayPharmacyByNumber (int storeNumber) {
        for (Pharmacy pharmacy: dataBase) {
            if (storeNumber == pharmacy.getPharmacyNumber()) {
                System.out.println(pharmacy);
            }
        }
    }

    static void displayAllPharmacies () {
        for (Pharmacy pharmacy: dataBase) {
            System.out.println(pharmacy);
        }
    }
}