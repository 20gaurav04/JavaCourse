import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        type casting
        int num = (int)(536.34f);
        System.out.println(num);

//        automatic type promotion in expressions
//        max range of byte is 256 so after that it would provide the modulo(range is -128 to 127)
//        int a = 555;
//        byte b = (byte)(a);
//
//        System.out.println(b);
//
//        byte x = 54;
//        x=x+5;(expilict conversion required)

//        int g = 'C';
//        System.out.println(g);(it will print the ASCII Value of 'C');
    }
}