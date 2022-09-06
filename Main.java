

public class Main {
    public static void main(String[] args) {
        short b[] = {16, 14, 12, 10, 8, 6, 4, 2};
        float[] x = new float[14];
        for (int j = 0; j < 14; j++)
        {
            x[j] = (-4) + (float)(Math.random()*((5 - (-4)) + 1));
            System.out.println(x[j]);

        }
        float[][] n = new float[8][14];
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 14; j++)
            {
               if (b[i] == 2)
               {
                   n[i][j] = (float) Math.log(Math.sqrt(Math.pow(Math.tan(x[j]), 2)));
               }
               else if (b[i] == 4 | b[i] == 8 | b[i] == 10 | b[i] == 12)
               {
                   n[i][j] = (float) Math.tan(Math.cbrt(Math.cbrt(x[j])));
               }
               else
               {
                   n[i][j] = (float) Math.pow(Math.pow(Math.tan(Math.asin((double) (x[j] - 0.5)/9)),3)/2 ,3);
               }
            }
        }
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 14; j++)
            {
                System.out.printf("%.4f", n[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
