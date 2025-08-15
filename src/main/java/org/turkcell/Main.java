package org.turkcell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mehmet Fatih KAVALA");
        int yas = 24;
        yas = 30;
        System.out.println(yas);
        yas = 40;

        String isim = "Mehmet Fatih KAVALA";
        // Metinsel değerler çift tırnak içine yazılır...
        System.out.println(isim);
        isim = "Engin Demiroğ";


        float sayi = 10.14f;
        // Float'ta sayının sonuna f/F koyulması gerekiyor
        double sayi1 = 10.14;
        long sayi2 = 10L;
        // Long'ta da sayının sonuna L konulması gerekir.
        short sayi3 = 11;
        char karakter = '4';
        // Tek tırnak karakter değerler için kullanılır...
        boolean aktif = true;



        System.out.println(10 + 10);
        System.out.println(11 - 10);
        System.out.println(11 * 10);
        System.out.println(11 / 10);
        System.out.println(11 % 10); // % ifadesi mod almaya yarar...



        int a = 10;
        a=15;
        a+=5;
        a-=5;
        a*=5;
        a/=5;

        System.out.println(a);

        System.out.println(a == 15);
        System.out.println(a != 15);

        if(yas > 18) {
            System.out.println("Kişi reşit");
        }
        else if (yas == 18){
            System.out.println("Kişi reşit ay kontrolü yap");
        }else {
            System.out.println("Kişi reşit değil");
        }
        }

    }
