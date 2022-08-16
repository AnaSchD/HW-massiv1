public class Main {
    public static void main(String[] args) {

        //task1
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = i+1;
            System.out.println(a[i]);
        }


        double[] b = {1.57, 7.654, 9.986};
        byte[] c = {70, 13, 45, 14};

        //task2

       for (int i = 0; i < a.length; i++)
                {
           if (i != a.length - 1)
               System.out.print(a[i] + ",");

           else
               System.out.println(a[i]);
                 }



        for (int d = 0; d < b.length; d++) {
            System.out.print(b[d] + ",");

        }
        double d1 = b[b.length - 1];
        System.out.println(d1);


        for (int f = 0; f < c.length; f++) {
            System.out.print(c[f] + ",");
        }
        int f1 = c[c.length - 1];
        System.out.println(f1);


        //task3


        for (int i2 = 2; i2 > 0; i2--)
        {
            System.out.print(a[i2] + ",");
        }
         int i2 = a[0];
        System.out.println(i2);


        for (int d2 = 2; d2 > 0; d2--)
        {
            System.out.print(b[d2] + ",");
        }
        double d2 = b[0];
        System.out.println(d2);

        for (int f2 = 3; f2 > 0; f2--)
        {
            System.out.print(c[f2] + ",");
        }
        int f2 = c[0];
        System.out.println(f2);

        //task4

        for (int i = 0; i < 2; i++)
        {
            if (a[i] % 2 == 0)
            {
                System.out.print(a[i] + ",");

            } else

            {
                System.out.print(a[i] + 1 + ",");
            }

        }

            if (a[a.length-1]%2==0)
                {
                    System.out.println(a[a.length-1]);
                }
            else
                {
                    System.out.println(a[a.length-1]+1);
                }


    }
}