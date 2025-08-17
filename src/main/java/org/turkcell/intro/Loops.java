package org.turkcell.intro;

public class Loops {
    public static void main(String[] args) {

       /*
        int[] numbers = {10,20,30,40};
        System.out.println(numbers[2]*5);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("merhaba");
        }

        for (int number : numbers) {
            System.out.println(number*5);
        }


        //Koşulu kontrol eder, çalışmaya başlar...
        int a = 0;
        while (a<5){
            a++;
            System.out.println("while çalıştı");
        }

        // Çalışmaya başlar, koşulu kontrol eder...
        int i = 0;
        do {
            System.out.println("dowhile çalıştı..");
        }while(i>5);
*/

        String[] ogrenciler ={"Utku", "Muzaffer","Secil","Ozgur"};

        for(String s : ogrenciler){
            if(s.equals("Muzaffer")){
                continue; // Bu iterasyonu burada bırak diğerine geç...
                //break; // Bu döngüyü tamamen kır(BİTİR)...
            }
            System.out.println("Öğrenci:" + s + "işlem yapıldı");
        }
    }
}
