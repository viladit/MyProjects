public class Lab1 {
    public static void main(String[] args) {

        long[] a = new long[16];
        double[] x = new double[17];
        for (int i = 0; i<=15; i++) {
            a[i] = i+5;
        }
        for (int i = 0; i<17; i++){
            x[i] = Math.random()*20-7;
        }

        double[][] a2 = new double[16][17];
        for (int i = 0; i<16; i++) {
            for (int j = 0; j<17; j++) {
                if (a[i] == 8) {
                    a2[i][j] = Math.sin(2/3*Math.tan(x[j]));
                }
                else if (a[i] == 6 || a[i] == 7 || a[i] == 14 || a[i] == 15 || a[i] == 16 || a[i] == 18 || a[i] == 19 || a[i] == 20) {
                    a2[i][j] = Math.cbrt(Math.asin(Math.cos(x[j])));
                }
                else {
                    a2[i][j] = Math.pow((Math.pow(Math.atan(Math.cos(x[j]))+1, Math.cbrt(Math.pow(2*x[j], x[j])))) / Math.cbrt(Math.pow((Math.asin(((x[j]+3)/2)*Math.E+1) / 2),3)-1), Math.sin(Math.cos(Math.pow(x[j]*x[j], 1/2*Math.cbrt(x[j])))) );
                }
            }
        }

        for (int i = 0; i<16; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.printf("%.5f", a2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
