package _02VariableAndDataType;

public class Main {
    public static void main(String[] args) {

        // Variable : Bellekte ayrılmış alanın adıdır. (myInt, myDouble vb.)
        // Primitive-Type : Temel veri türüdür.(8 tanedir).

        // Tamsayı
        byte myByte = 1;
        short myShort = 25;
        int myInt = 44;
        long myLong = 457;

        System.out.printf("byte: %d short: %d int: %d long: %d %n",myByte,myShort,myInt,myLong);

        // Ondalıklı Sayı
        double myDouble = 12.4d;
        float myFloat = 24.f;

        System.out.printf("double: %f float: %f %n",myDouble,myFloat);
        // Karakter
        char myCharOne = 'A';
        char myCharTwo =  123;
        char myCharThree = '\u1453'; // unicode system

        System.out.printf("char one: %c char two: %c char three: %c %n", myCharOne,myCharTwo,myCharThree);
        // Bool
        boolean myBoolTrue = true;
        boolean myBoolFalse = false;

        System.out.printf("bool true : %b bool false : %b %n", myBoolTrue,myBoolFalse );
    }
}
