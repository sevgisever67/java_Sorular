package metodOluşturma;

import java.util.Locale;
import java.util.Scanner;

public class C02_İsimSoyisimDüzenle {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz");
        String isim=scan.next();
        System.out.println("Lütfen Soyisminizi giriniz");
        String soyİsim=scan.next();

        System.out.println(isimSoyİsimDüzenle(isim, soyİsim));

    }

    public static String isimSoyİsimDüzenle(String isim, String soyİsim) {


return isim.toUpperCase().substring(0,1)
        +isim.toLowerCase().substring(1,isim.length())+" "+
        soyİsim.toUpperCase().substring(0,1)+
        soyİsim.toLowerCase().substring(1,soyİsim.length());
    }
}
