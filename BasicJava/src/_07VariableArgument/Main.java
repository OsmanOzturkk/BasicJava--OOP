package _07VariableArgument;

public class Main {
    public static void main(String[] args) {

        System.out.println(sayilariTopla(1,2,3));
    }

    public static int sayilariTopla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        return toplam;
    }
}
