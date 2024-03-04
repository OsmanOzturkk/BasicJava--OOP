package _06Methods;

public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 12;

        int sum = topla(number1,number2);
        System.out.println("Toplam = " + sum);
        yazdir();
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    public static void yazdir() {
        System.out.println("Sayılar Toplandı");
    }




}
