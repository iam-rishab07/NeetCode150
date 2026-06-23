package Practice;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String s)
    {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left<right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.next();
        String rev = reverse(str);
        System.out.println("The Reversed string is "+rev);
    }
}
