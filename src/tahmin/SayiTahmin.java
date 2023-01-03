package tahmin;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
             /*
   1 ile 100 arasında bir sayı belirleyelim.
   (bilgisayar dışında bir toplulukta, bulunanlara tek tek sorulur, bilen kaybeder)
   kullanıcıdan o sayıyı bilmemesi gerektiğini söyleyelim.
   bilirse oyunu kaybedeceği söylenir.
   istenen sayılar dışından söylerse de oyunu kaybeder.
   örnek: tutulan sayı 62 olsun.
   kullanıcıdan sayı istenir.
   - 1 ile 100 arasında bir sayı söyleyin.
   - 20
   - 20 ile 100 arasında
   - 30
   - 30 ile 100 arasında
   - 80
   - 30 ile 80 arasında
   - 50
   - 50 ile 80 arasında
   - 60
   - 60 ile 80 arasında
   - 70
   - 60 ile 70 arasında
   - 65
   - 60 ile 65 arasında
   - 63
   - 60 ile 63 arasında
   - 61
   - 61 ile 63 arasında
   - 62
   -BİLDİNİZ....
    */

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int bilgisayardakiSayi = rnd.nextInt(100) + 1;
        System.out.println(bilgisayardakiSayi);
        System.out.println("0-100 Arasında Bir Sayı giriniz :");
        int baslangıc = 0;
        int bitis = 100;
        int girilensayi = 0;
        while (!(girilensayi == bilgisayardakiSayi)) {
            System.out.print("Tahmininiz :");
            girilensayi = scan.nextInt();
    }
}
