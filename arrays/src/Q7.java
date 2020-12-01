public class Q7 {

    // given 2 strings check is one string is a part of another or not (rotate of other or not )
    // example
    // s1 = "waterbottel"
    // s2 = "erbottelwat"


    boolean isrotate(String s1, String s2)
    {

        s1 += s1;
        return s1.contains(s2);
    }

}
