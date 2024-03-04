package _Challange;

public class EnBuyukSayi {
    public static void main(String[] args) {

        int sayi1 = 266;
        int sayi2= 25;
        int sayi3= 26;

        int enBuyukSayi = sayi1;

        if (enBuyukSayi < sayi2) {
            enBuyukSayi = sayi2;
        }

        if (enBuyukSayi < sayi3) {
            enBuyukSayi = sayi3;
        }

        System.out.println("En büyük sayı : " + enBuyukSayi);

    }
}
