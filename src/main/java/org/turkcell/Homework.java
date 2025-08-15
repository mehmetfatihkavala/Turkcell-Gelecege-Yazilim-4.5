package org.turkcell;

public class Homework {
    public static void main(String[] args) {
        //MOD
        /*int a =10;
        if(a%2==0){
            System.out.println("çift");
        }else System.out.println("tek");*/


        //Sayı karşılaştırma
        /*
        int sayi1 = 40;
        int sayi2 = 5;
        int sayi3 = 3;
        if(sayi3> sayi2 && sayi3>sayi1){
            System.out.println(sayi3);
        } else if (sayi2>sayi1 && sayi2>sayi1) {
            System.out.println(sayi2);
        }else System.out.println(sayi1);

         */
        // Not derecelendirme
        int not = 65;
        if (not<=100 && not>=90){
            System.out.println("Harf notunuz AA");
        } else if (not<90 && not>=80) {
            System.out.println("Harf notunuz BB");
        } else if (not<80 && not>=70) {
            System.out.println("Harf notunuz CC");
        }else if (not<70 && not>=60) {
            System.out.println("Harf notunuz CD");
        }else if (not<60 && not>=50) {
            System.out.println("Harf notunuz DD");
        }else System.out.println("Harf notunuz FF: Kaldınız...");

    }
}
