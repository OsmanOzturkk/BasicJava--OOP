package _03ControlStatament;

public class Loop {

    public static void main(String[] args) {

        // For Loop

        for (int i = 0; i < 10; i++) {
            System.out.println("Sayı = " + i);
        }
        System.out.println("For Döngüsü Bitti");


        // While Loop
        int i = 0;
        while (i < 10){
            System.out.println("Sayı = " + i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        // Do-While Loop
        int j = 100;
        do {
            System.out.println(j);
            j+=2;
        } while (j < 10);

        System.out.println("Do-While Döngüsü Bitti");
    }
}

