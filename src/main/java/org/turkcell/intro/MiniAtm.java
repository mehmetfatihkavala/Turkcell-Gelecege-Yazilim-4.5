package org.turkcell.intro;

import java.util.Scanner;

public class MiniAtm {
    static  String username="user";
    static  String password="1234";
    static double balance = 0;
    static double totalDeposit = 0;
    static double totalWithdrawal = 0;
    static int totalBillsPaidCount = 0;
    static double totalBill = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = " 1. Para yatır"+
                "\n 2. Para çek" +
                "\n 3. Bakiye görüntüle"+
                "\n 4. Fatura Öde" +
                "\n 5. Çıkış";
        String bill = " 1. Elektrik" + "\n 2. Su" + "\n 3. İnternet";
        while(login()){

            boolean process = true;
        while(process){
            System.out.println(menu);
            System.out.println("Yapmak istediğiniz işlemi seçiniz;");
            int islem  = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                    double yatir = scanner.nextDouble();
                    deposit(yatir);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                    double cek = scanner.nextDouble();
                    withdraw(cek);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + balance);
                    break;
                case 4:
                    System.out.println("Ödemek istediğiniz faturayı seçiniz...");
                    System.out.println(bill);
                    int selection = scanner.nextInt();
                    System.out.println("Ödemek istediğiniz tutarı giriniz: ");
                    double pay = scanner.nextDouble();
                    payBill(selection,pay);
                    scanner.nextLine();

                    break;
                case 5:
                    printSummary();
                    process = false;
                    return;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin...");

            }
        }}

    }
    public static boolean login () {
        int girishak=3;
        while(girishak >0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanıcı adı:");
            String name=scanner.nextLine();
            System.out.println("Şifre:");
            String pass=scanner.nextLine();

            if (name.equals(username) && pass.equals(password)){
                System.out.println("Giriş Başarılı");
                return true;

            }else{
                girishak--;
                System.out.println("Hatalı giriş.Kalan hakkınız: " +girishak);
            }

        }

        return false;
    }
    public static void deposit(double amount){
        if(amount>0){
            balance+=amount;
            totalDeposit += amount;
            System.out.println("Yatırılan tutar: " + amount + "\nBakiye: " + balance);
        }else System.out.println("Geçerli bir değer giriniz...");
    }
    public static void withdraw(double amount){
        if(amount<=balance){
            if(amount>0  && amount <= 5000){
                balance-=amount;
                totalWithdrawal += amount;
                System.out.println("Çekilen tutar: " + amount + "\nKalan Bakiye: " + balance);

            }else if(amount>5000){
                double commission = amount * 0.02;
                balance = balance - (amount+commission);
                totalWithdrawal =totalWithdrawal+ (amount+commission);
                System.out.println("Çekilen tutar: " + (amount+commission) + "\nKalan Bakiye: " + balance);

            }else System.out.println("Geçerli bir değer giriniz...");
        }else System.out.println("Bakiye yetersiz...");

    }
    public static void payBill(int billType, double amount){
        if(amount<= balance){
            if(billType==1 && amount>0){
                double discount = amount * 0.05;
                balance = balance - (amount - discount);
                totalBill += (amount - discount);
                totalBillsPaidCount++;
                System.out.println("Ödenen tutar: " + (amount-discount) + "\nKalan Bakiye: " + balance);
            }else if(billType==2 && amount>0){
                double discount = amount * 0.03;
                balance = balance - (amount - discount);
                totalBill += (amount - discount);
                totalBillsPaidCount++;
                System.out.println("Ödenen tutar: " + (amount-discount) + "\nKalan Bakiye: " + balance);

            } else if(billType==3 && amount>0){
                double discount = amount * 0.02;
                balance = balance - (amount - discount);
                totalBill += (amount - discount);
                totalBillsPaidCount++;
                System.out.println("Ödenen tutar: " + (amount-discount) + "\n Kalan Bakiye: " + balance);

            }else System.out.println("Geçerli bir değer giriniz...");

        }else System.out.println("Bakiye yetersiz...");
    }
    public static void printSummary(){
        System.out.println("\n Toplam yatırılan tutar: "+ totalDeposit + "\n Toplam çekiilen tutar: "+ totalWithdrawal +
                "\n Toplam yatırılan fatura: " + totalBillsPaidCount+
                "\n Net Hareket: " + (totalDeposit - (totalWithdrawal + totalBill)));
    }
}
