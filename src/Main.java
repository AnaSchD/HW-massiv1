import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //task1
        int[] a = new int[3];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};
        byte[] c = {70, 13, 45, 14};

        System.out.println();
        //task2

        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i]);
            }
        }


        for (int d = 0; d < b.length; d++) {
            if (d != b.length - 1) {
                System.out.print(b[d] + ",");
            } else {
                System.out.println(b[d]);
            }
        }


        for (int f = 0; f < c.length; f++) {
            if (f != c.length - 1) {
                System.out.print(c[f] + ",");
            } else {
                System.out.println(c[f]);
            }
        }

        System.out.println();

        //task3


        for (int i2 = a.length - 1; i2 >= 0; i2--)
        {
            if (i2 != 0)
            {
                System.out.print(a[i2] + ",");
            } else
            {
                System.out.println(a[i2]);
            }
        }


        for (int d2 = b.length - 1; d2 >= 0; d2--)
        {
            if (d2 != 0)
            {
                System.out.print(b[d2] + ",");
            }
            else
            {
                System.out.println(b[d2]);
            }
        }


        for (int f2 = c.length - 1; f2 >= 0; f2--) {
            if (f2 != 0) {
                System.out.print(c[f2] + ",");
            } else {
                System.out.println(c[f2]);
            }
        }

        System.out.println();

        //task4

        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] % 2 != 0) {
                a[i2]++;
            }

            if (i2 != a.length - 1) {
                System.out.print(a[i2] + ",");
            } else {
                System.out.println(a[i2]);
            }
        }
        System.out.println();

        //task5*
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (i == j || i + j == matrix.length-1)
                {
                    System.out.print("1 ");
                }
                else
                    System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

            //task6*

        int[] q = {5, 4, 3, 2, 1};
       System.out.println(Arrays.toString(q));

        int[] w = new int [q.length];

        for (int i = q.length - 1, a1 = 0; i >= 0; i--,a1++)
        {
            w[a1] =q[i];
        }
        System.out.println(Arrays.toString(w));
        System.out.println();

        //task7*
        System.out.println(Arrays.toString(q));

        for (int i = 0, e = 0, r = q.length-1; i < q.length / 2; i++, r--)
        {
            e = q[i];
            q[i] = q[r];
            q[r] = e;
        }
        System.out.println(Arrays.toString(q));
    }

}

