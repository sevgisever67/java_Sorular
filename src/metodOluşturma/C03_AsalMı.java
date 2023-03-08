package metodOluşturma;

import java.util.Scanner;

public class C03_AsalMı {
   //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
   //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
   //sonuclarini donduren bir method olusturun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int  sayi = scan.nextInt();

        System.out.println(asalMi(sayi));

    }public static String asalMi(int sayi){

        int sayaç = 0;


        if ( sayi == 1) {
            return ("girdiğiniz sayi asal değil");
        } else if ( sayi == 2) {
            return ("girdiğiniz sayı asaldır");

        } else {
            for (int i = 2; i <  sayi; i++) {
                if ( sayi % i == 0) {
                    sayaç++;
                }
            }
            if (sayaç > 0) {
                return ("girdiğiniz sayı asal değildir");
            } else {
                return ("girdiğinizsayi asaldır");

            }
        }
    }
}


