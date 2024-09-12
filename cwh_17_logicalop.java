import java.util.Scanner;

public class cwh_17_logicalop {
    public static void main(String[] args) {
        System.out.println("For Logical And.....");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
            System.out.println("For Logical Or....");
            boolean d = true;
            boolean e = false;
            if (d||e){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        System.out.println("For Logical Not....");
            boolean f = true;
            boolean g = false;
        System.out.print("Not(f) is : ");
        System.out.println(!f);
        System.out.print("Not(g) is : ");
        System.out.println(!g);
    }
}
