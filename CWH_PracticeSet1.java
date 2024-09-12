import java.util.Scanner;

public class CWH_PracticeSet1 {
    public static void main(String[] args) {
        //Question 1
        //int A = 64;
        //int B = 56;
        //int C = 89;
        //int sum = A+B+C;
        //System.out.println(sum);

        //Question 2
        //float Sub1 = 89;
        //float Sub2 = 90;
        //float Sub3 = 85;
        //float cgpa = (Sub1+Sub2+Sub3)/30;
        //System.out.println(cgpa);
        //Scanner sc = new Scanner(System.in);
       //String name = sc.next();
        //System.out.println("Hello "+name+", have a good day!");
        double km;
        System.out.println("Please enter kilometers:");
        Scanner in = new Scanner(System.in);
        km = in.nextDouble();
        double miles = km / 1.6;
        System.out.println(miles + " Miles");

        //System.out.println("Check your number:");
        //Scanner sc = new Scanner(System.in);
        //System.out.println(sc.hasNextInt());
    }
}
