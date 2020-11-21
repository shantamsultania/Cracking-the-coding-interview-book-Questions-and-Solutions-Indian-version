import java.util.HashSet;
import java.util.Set;

public class Q1 {

    // program to check for Unique characters in a String


    // us9ng hashset
    // time complexity = O(n) where  n = s.length
    // Space Complexity = O(1)
    public boolean isUnique(String s)
    {
        if(s == null)
        {
            return false;
        }
        if(s.length() == 1 && !s.equals(" "))
        {
            return true;
        }
        Set<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(hs.contains(ch) )
            {
                return false;
            }
            else if(ch >= 'a' && ch <= 'z')
                {
                    hs.add(ch);
                }
            else if(ch >= 'A' && ch <= 'Z') {
                hs.add(ch);
            }
            else
            {
                return false;
            }

        }
        return true;
    }

}
