package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void fib(int n)
    {
        int first = 0, second = 1;
        for(int i=0;i<n;i++)
        {
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        System.out.println("the first "+num+" numbers in fibonacci sequence : ");
        fib(num);
    }
}
