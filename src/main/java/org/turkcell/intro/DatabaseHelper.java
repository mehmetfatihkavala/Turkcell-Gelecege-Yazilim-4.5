package org.turkcell.intro;

public class DatabaseHelper {
    // static => Bulunduğu nesnenin türetilmesine gerek duymadan...
    public static void connect(String username,String password){
        System.out.println("Varsayılan bilgiler ve kullanıcı bilgisi ile giriş yapılıyor...");
    }
    public static void connect(String username,String password,String url){
        System.out.println("Url bilgisindeki db'e bağlanılıyor...");
    }
}
