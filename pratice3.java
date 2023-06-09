import java.util.Scanner;
public class pratice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float m=(float) ((A/11 * 3.5) + (B/11 * 7.5));

        System.out.printf("MEDIA = %.5f\n",m);
    }
}
