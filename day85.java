import java.util.Scanner;
public class day85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];
            }
        }
        System.out.println(m);
        in.close();
    }
}
