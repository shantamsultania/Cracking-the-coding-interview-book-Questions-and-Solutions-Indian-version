import java.util.HashSet;

public class Q4 {

    // pale -> ple
    // pales,pale
    // pale bale = True;
    // pale , bake = false;
    // insert , remove, replace


    // approach 1
    boolean check_for_equal(String s1,String s2)
    {

        if (s1.equals(s2))
        {
            return true;
        }

        // pale
        // ple
        if (s1.length()- s2.length() > 1)
        {
            return false;
        }
        else if (s1.length() == s2.length())
        {
            int c =0;
            for (int i=0;i<s1.length();i++)
            {
                if (s1.charAt(i) != s2.charAt(i))
                {
                    c++;
                }
            }
            if (c>1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            int c =0;
           HashSet<Character> hs = new HashSet<>();
           for (int i=0;i<s1.length();i++)
           {
               char ch = s1.charAt(i);
               hs.add(ch);
           }
           for (int i=0;i<s2.length();i++)
           {
               char ch = s2.charAt(i);
               if (!hs.contains(ch))
               {
                   c++;
               }
           }
           if (c>1)
           {
               return false;
           }
           else
           {
               return true;
           }
        }
    }

    boolean is_edit_distance(String s1,String s2)
    {
        if (s1.equals(s2))
        {
            return true;
        }
        if (s1.length()- s2.length() > 1)
        {
            return false;
        }
        if (s1 == null && s2 != null || s2 == null && s1 != null) {
            return false;
        }
        int c = 0;
        int i=0,j=0;
        while (i<s1.length() && j < s2.length())
        {
            if (s1.charAt(i) == s2.charAt(j))
            {
                i++;
                j++;
            }
            else if (s1.charAt(i) != s2.charAt(j))
            {
                if (c > 0)
                {
                    return false;
                }
                if (s1.length()> s2.length())
                {
                    i++;
                }
                if (s2.length()>s1.length())
                {
                    j++;
                }
                else
                {
                    i++;
                    j++;
                }
                c++;
            }
        }

        if (i<s1.length() || j < s2.length())
        {
            c++;
        }
        return c==1;
    }


}
