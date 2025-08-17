package org.turkcell.intro;

public class Oop {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2025);
        System.out.println(car1.getYear());
        car1.startRent();

        Motorcycle m1 = new Motorcycle();
        m1.setKm(10000);
        m1.startRent();

        System.out.println("*************************************");
        //Polymorphism
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.startRent();
        v2.startRent();

        DatabaseHelper.connect("mfk","1234");
        DatabaseHelper.connect("mfk","1234","jdbc://localhost:3306");

    }
}



/*
        // Her class aynı zamanda yeni bir veri türü...
        Car car1 = new Car("Honda","Civic",2025,100);
        car1.startRent();
        // new o classtan yeni bir "instance" üretir...

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.startRent();

        // Encapsulation-Kapsülleme
        //car2.year = 10; // SET
        //System.out.println(car2.year); // GET


        car2.setYear(2025);
        car2.setYear(20); // SET
        System.out.println(car2.getYear()); // GET
 */