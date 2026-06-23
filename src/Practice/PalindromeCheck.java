package Practice;

import java.util.Scanner;

public class PalindromeCheck {


    public static boolean isPalindrome(String s)
    {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length()-1;
        while(start<=last)
        {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast))
            {
                last--;
            }else{
                if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast))
                {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.next();
        boolean ans = isPalindrome(str);
        if(ans) System.out.println("The String is Palindrome");
        else System.out.println("The String is not a Palindrome");
    }
}
