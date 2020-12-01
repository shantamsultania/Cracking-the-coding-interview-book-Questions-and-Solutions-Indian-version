public class Q6 {


    // given a N*N matrix
    // rotate the matrix by 90 degree

    void rotate(int [][]a)
    {
        if (a == null)
        {
            return;
        }
        int [][]b= new int[a.length][a[0].length];
        for(int i =0;i<a.length;i++)
        {
            int k = a[i].length-1;
            for(int j=0;j<a[i].length;j++)
            {
                int r = k-j;
                b[i][j] = a[r][i];
            }
        }

        for(int i =0;i<a.length;i++)
        {

            System.arraycopy(b[i], 0, a[i], 0, a[i].length);
        }



    }
}
