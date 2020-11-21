import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q2 {


//Write a function to check whether two given strings are
// Permutation of each other or not. A Permutation of a string is
// another string that contains same characters, only
// the order of characters can be different.
// For example, “abcd” and “dabc” are Permutation of each other.

    public boolean checkm1(String s1,String s2)
    {
        if (s1 == null || s2 == null)
        {
            return true;
        }
        HashSet<Character> hs = new HashSet<>();
        for (int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            hs.add(ch);
        }

        for (int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if (!hs.contains(ch))
            {
                return false;
            }
        }
        return true;
    }

}