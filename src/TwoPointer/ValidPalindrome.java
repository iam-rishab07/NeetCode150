package TwoPointer;

public class ValidPalindrome {
    public boolean isAlphaNum(char c)
    {
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }

    public boolean checkPalindrome(String str)
    {
        int i = 0, j = str.length()-1;
        while(i<j)
        {
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(!isAlphaNum(left)) left++;
            else if(!isAlphaNum(right)) right--;
            else{
                if(Character.toLowerCase(left)!=Character.toLowerCase(right))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }

}
