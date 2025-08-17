package org.turkcell.intro;

public class Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("a");
        veritabaninaBaglan("abc1230");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");


        int sayi1 = topla(5,7);
        System.out.println(sayi1);
        int sayi2 = topla(9,8);
        System.out.println(sayi2+50);
    }
    public static void veritabaninaBaglan(String veritabaniAdi){
        if(veritabaniAdi.length()<2)
            return; // Void fonksiyonda methodu kesmeye/bitirmeye yarar..
        System.out.println(veritabaniAdi+" veri tabanı bağlantısı x15");
    }

    public static int topla(int a,int b){
        return a+b;
    }
}
