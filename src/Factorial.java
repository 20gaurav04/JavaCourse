import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x = sc.nextInt();

        int fact =1;

        if(x==0 || x==1) {
            System.out.print("The factorial of 0 is : 1");
        }
        else {
            for(int i = 1;i<=x;i++)
            {
                fact=fact*i;
            }
            System.out.print("The factorial of"+x+"is"+ " "+fact);
        }
    }
}