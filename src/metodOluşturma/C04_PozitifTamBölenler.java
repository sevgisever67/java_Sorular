package metodOluşturma;

import java.util.Scanner;

public class C04_PozitifTamBölenler {
   //  Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
   // bolenleri sayisini bulup bize donduren bir method olusturun
   public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
      System.out.println("lütfen bir tam sayı giriniz");
      int girilenSayi= scan.nextInt();
      System.out.println(pozitifBölenHesapla(girilenSayi));


   }

   public static int pozitifBölenHesapla(int sayi) {
      int sayaç=0;

      for (int i = 2; i <sayi; i++) {
         if (sayi%i==0) {
            sayaç++;

         }


      }
     return sayaç;
   }
}

