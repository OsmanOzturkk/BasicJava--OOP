package _04Arrays;

public class Main {
    public static void main(String[] args) {

        // Array: Diziler aynı veri türünden birden çok veriyi depolamamızı sağlar.

        String[] students = new String[4];
        students[0] = "Ahmet";
        students[1] = "Mehmet";
        students[2] = "Ali";
        students[3] = "Salih";

        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);
        }

        System.out.println("------");

        for (String student: students) {
            System.out.println(student);
        }
    }
}
