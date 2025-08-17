package org.turkcell.intro;


/*
  SuperClass => Kalıtım alınan class(Vehicle)
  SubClass => Kalıtım yapan class(Car)
 */
public class Car extends Vehicle {

    private int doorCount;

    public Car(){}

    public Car(String brand, String model, int year, float km, int doorCount) {
        super(brand, model, year, km);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
/*
    Erişim Belirliyiciler:
    Public => Bu class diğer tüm classlardna erişilebilir..
    Protected => Bu class alt sınıflardan, alt paketlerden erişilebilir...
    Private => Yalnızca o sınıfın içinden erişilebilir...
    Default => Bu class aynı sınıf ve aynı paket dışında erişilebilir olmasın..

    // Her nesnenin içinde ctor(yapıcı blok) otomatik oluşur...
// Ama istersek manuel oluşturup özelleştirme yapabiliriz...

// All-args-Constructor
public Car(String brand,String model, int year,float km){
    this.brand=brand; // this=> Classın kendisini ifade eder...
    this.model=model;
    this.year=year;
    this.km=km;
    System.out.println("1. Ctor bloğu...");
}
    // No-args-Constructor...
public Car(){
    System.out.println("2. ctor bloğu");
}



    public void startRent(){
        System.out.println("Kiralama başladı..."+ this.brand);
    }
    public void endRent(){
        System.out.println("Kiralama bitti...");
    }

// Getter-setter methods
    // Setter methods
    public void setYear(int year){
        if (year<200){
            System.out.println("Yıl 2000'den küçük olamaz...");
            return;
        }
        this.year=year;
    }
    // Getter methods
    public int getYear(){
        return this.year;
    }

 */