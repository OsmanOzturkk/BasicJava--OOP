package _Challange;

public class KalinVeInceHarfler {
    public static void main(String[] args) {

        char harf = 'B';

        switch (harf) {
            case 'A', 'I', 'O', 'U' -> System.out.println("Kalın sesli harf");
            default -> System.out.println("İnce sesli harf");
        }
    }
}
