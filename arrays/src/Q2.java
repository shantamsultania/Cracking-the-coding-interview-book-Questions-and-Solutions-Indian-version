import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

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
        if (s1.length() != s2.length())
        {
            return false;
        }
        TreeMap<Character,Integer> h1 = new TreeMap<Character, Integer>();
        TreeMap<Character,Integer> h2 = new TreeMap<Character, Integer>();

       for (char ch1 : s1.toCharArray())
       {
           if (h1.containsKey(ch1))
           {
               h1.put(ch1,h1.get(ch1)+1);
           }
           else
           {
               h1.put(ch1,1);
           }
       }
        for (char ch2 : s2.toCharArray())
        {

            if (h2.containsKey(ch2))
            {
                h2.put(ch2,h2.get(ch2)+1);
            }
            else
            {
                h2.put(ch2,1);
            }

        }

        return h1.equals(h2);
    }

}