import java.util.*;

public class Q5 {


    // aabbcccccaaa
    // a3b2c5a3
    // length of original > new if not then return original
    //
    // assume that the that the string has both upper and lowercase elements
    //

    String compressor(String s)
    {
        if (s.length() <=1)
        {
            return s;
        }
        Map<Character,Integer> hm = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }

        String res = "";
        Iterator i = hm.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry map = (Map.Entry) i.next();
            Character key = (Character) map.getKey();
            Integer value = (Integer)map.getValue();
            res +=key;
            res +=value;
        }
        if (res.length() > s.length())
        {
            return s;
        }
        else
        {
            return res;
        }


    }
    String compresser(String s)
    {
        if (s.length() <=1)
        {
            return s;
        }

        String res = "";
        int i=0;
        while (i <s.length())
        {
            char ch = s.charAt(i);
            int c =0;
            for (int j=i;j<s.length();j++)
            {
                if (ch == s.charAt(j))
                {
                    c++;
                }
                else
                {
                    break;
                }

            }
            res += ch;
            res += c;
            i+=c;
        }

       return res;
    }
    String compressor1(String s)
    {
        s += ";";
        StringBuilder res = new StringBuilder();
        char temp = ' ';
        int c =0;
        for (int i=0;i<s.length();i++)
        {
            if (i == 0)
            {
                res.append(s.charAt(i));
                temp = s.charAt(i);
                c++;
            }
            else if(temp == s.charAt(i))
            {
                c++;
            }

            else
            {
                res.append(c);
                c = 1;

                temp = s.charAt(i);
                if (temp == ';')
                {
                    break;
                }
                res.append(s.charAt(i));

            }

        }
        if (res.length() < s.length())
        {
            return res.toString();
        }
        else
        {
            return s;
        }


    }
}
