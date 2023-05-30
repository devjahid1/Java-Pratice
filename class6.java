import java.util.Scanner;
public class class6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                //Question 1 //
        System.out.println("Question No. 1");

        System.out.println("Enter some number : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Total Number Is = "+sum);

                //Question 2 //

    System.out.println("Enter Subject 1 = ");
    float d = sc.nextFloat();
    System.out.println("Enter Subject 2 = ");
    float e = sc.nextFloat();
    System.out.println("Enter Subject 3 = ");
    float f = sc.nextFloat();
    float sum2 = (d + e + f)/3;
    System.out.println("Total Gpa is = "+sum);

            //Question 3//
    System.out.print("Enter Your Name : ");
    String str = sc.next();
    System.out.println("Hello "+str+" Good Morning");


        
    }
}
