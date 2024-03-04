package _03ControlStatament;

public class IfAndSwitch {
    public static void main(String[] args) {

        // if-else
        int age = 15;

        if (age > 18) {
            System.out.println("Yaş 18 den büyüktür");
        } else {
            System.out.println("Yaş 18 den küçüktür ");
        }

        // switch-case (yeni)

        char grade = 'A';

        switch (grade) {
            case 'A' -> System.out.println("Mükemmel : Geçtiniz");
            case 'B', 'C' -> System.out.println("İyi :  Geçtiniz");
            case 'D' -> System.out.println("Fena Değil : Geçtiniz");
            case 'F' -> System.out.println("Maalesef kaldınız");
            default -> System.out.println("Geçersiz Not Girdiniz");
        }

        // switch-case(eski)

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi :  Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
                break;


        }
    }
}
