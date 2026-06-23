package Stack;

// LeetCode 22 : generate Parenthesis
import java.util.*;
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }

    private void solve(String curr,int open,int close,int total,List<String> ans)      // Recursion
    {
        if(curr.length()==total*2)      // we got n open and n close parenthesis
        {
            ans.add(curr);
            return;
        }
        // until no. of open is less than n AND no. of close is less than open
        if(open<total) solve(curr+"(",open+1,close,total,ans);
        if(close<open) solve(curr+")",open,close+1,total,ans);
    }
}
