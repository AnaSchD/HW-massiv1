public class Main {
    public static void main(String[] args) {

        //task1
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        byte[] c = {70, 13, 45, 14};

        //task2

        for (int i = 0; i < 2; i++) {
            System.out.print(a[i] + ",");
        }
        int i1 = a[a.length - 1];
        System.out.println(i1);

        for (int d = 0; d < 2; d++) {
            System.out.print(b[d] + ",");

        }
        double d1 = b[b.length - 1];
        System.out.println(d1);


        for (int f = 0; f < 3; f++) {
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

    }
}