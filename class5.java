import java.util.Scanner;
public class class5 {
    public static void main(String[] args) {
        System.out.println("Calculate Your Exam Marks");
        Scanner sc = new Scanner(System.in);
        System.out.print("History of Bangladesh Mark = ");
        float he = sc.nextFloat();
        System.out.print("Bangladesh Studies Mark    = ");
        float bs = sc.nextFloat();
        System.out.print("Enter Calculus Marks       = ");
        float cal = sc.nextFloat();
        System.out.print("Destric Math Mark          = ");
        float dm = sc.nextFloat();
        System.out.print("Physics 1 Marks            = ");
        float phy = sc.nextFloat();
        System.out.print("English 1 Marks            = ");
        float eng = sc.nextFloat();
        System.out.println("===============================");
        float Total = he + bs + cal + dm + phy + eng;
        System.out.println("Total Mark Is              = "+Total);
        float Gpa = Total/6;
        System.out.print("Total Gpa Is               = "+Gpa);


    }
}
