import java.util.Scanner;;
public class class4 {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
       //Integer Number
        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        int sum1 = a + b;
        System.out.println(sum1);
        //Float Number
        System.out.println("Enter Number 3 :");
        float c = sc.nextFloat();
        System.out.println("Enter Number 4 : ");
        float d = sc.nextFloat();
        float sum2 = c + d;
        System.out.println(sum2);
        //String Value
       String e = sc.nextLine();
        System.out.println(e);
        
        //If check any number int, float, or, double then use Boolean
       //boolean bool = sc.hasNextInt();
      //System.out.println(bool);


        }
    }
