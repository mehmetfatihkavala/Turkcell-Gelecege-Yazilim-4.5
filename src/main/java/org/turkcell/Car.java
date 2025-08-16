package org.turkcell;

public class Car {
    public String brand;
    public String model;
    public int year;
    public float km;


// Her nesnenin içinde ctor(yapıcı blok) otomatik oluşur...
// Ama istersek manuel oluşturup özelleştirme yapabiliriz...
public Car(String brand){
    System.out.println("1. Ctor bloğu...");
}
public Car(){
    System.out.println("2. ctor bloğu");
}



    public void startRent(){
        System.out.println("Kiralama başladı...");
    }
    public void endRent(){
        System.out.println("Kiralama bitti...");
    }
}
/*
    Erişim Belirliyiciler:
    Public => Bu class diğer tüm classlardna erişilebilir..
    Protected => Bu class alt sınıflardan, alt paketlerden erişilebilir...
    Private => Yalnızca o sınıfın içinden erişilebilir...
    Default => Bu class aynı sınıf ve aynı paket dışında erişilebilir olmasın..
 */