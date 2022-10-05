package com.gokhankaplan.notort;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int mat, fizik, turkce, muzik, tarih, kimya;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.println("fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println("turkce notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.println("muzik notunuzu giriniz : ");
        muzik = input.nextInt();

        System.out.println("tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.println("kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        int toplam = kimya + mat + muzik + tarih + fizik + turkce;
        int notOrtalaası = toplam / 6;
        boolean sonuc = notOrtalaası >= 60;

        System.out.println("Not Ortalamanız: " + notOrtalaası);
        String string = sonuc ? "Geçtiniz" : "Kaldınız";
        System.out.println(string);

    }
}
