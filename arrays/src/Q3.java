public class Q3 {


    // urlfy
    // "Mr_john_smith___" , length = 13
    // "Mr%20john%20smith"

    // Time Complexity = O(n)

    public String urlfy(String s1,int n)
    {
        s1 = s1.trim();

        s1 = s1.replaceAll(" ","%20");

        return s1;
    }

}
