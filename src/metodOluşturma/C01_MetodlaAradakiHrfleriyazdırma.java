package metodOluşturma;

import java.util.Scanner;

public class C01_MetodlaAradakiHrfleriyazdırma {
    public static void main(String[] args) {
      // Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
      // baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
      // bir method olusturun.
      //         - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
      // mesaji verin
      // - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
      // yazdirin.

        String metin="java iyidir hoştur amma çalışmak zordur";


   aradakiharflaeriYazdır(metin);




    }

    public static void aradakiharflaeriYazdır(String str) {
        Scanner scan=new Scanner(System.in);
        System.out.println("java iyi hoş ama zordur");
        System.out.println("istediğiniz başlangıç ve bitiş indexini giriniz ");
        int başlangiçİndex= scan.nextInt();
        int bitisİndexi= scan.nextInt();
        if (başlangiçİndex>=bitisİndexi){
            System.out.println("başlangiç indexi bitiş indexinden büyük olamaz");
            aradakiharflaeriYazdır(str);
        } else if (başlangiçİndex>str.length()||bitisİndexi>str.length()) {
            System.out.println("geçerli bi index numarası giriniz");
            aradakiharflaeriYazdır(str);
        }else {
            System.out.println(str.substring(başlangiçİndex,bitisİndexi));
            }
        }
    }



