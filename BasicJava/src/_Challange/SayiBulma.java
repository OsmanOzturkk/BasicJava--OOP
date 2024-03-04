package _Challange;

public class SayiBulma {
    public static void main(String[] args) {

        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacakSayi = 2;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı Mevcuttur");
        } else {
            System.out.println("Sayı Mevcut Değildir");
        }
    }
}
