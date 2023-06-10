import java.util.Scanner;
public class class10{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int i = sc.nextInt();
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
    }
}