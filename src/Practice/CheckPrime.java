package Practice;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if(prime) System.out.println("The number is prime");
        else System.out.println("The Number is not prime");
    }
}
