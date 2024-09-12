import java.util.Scanner;
public class cwh_23_Ch5_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Number of Natural numbers : ");
        int n =sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println(i);
        }*/
        /*System.out.print("First n Odd numbers : ");
        int num = sc.nextInt();
        for (int odd = 0; odd<=num; odd++){
            System.out.println(2*odd+1);
        }*/
        //Decreamenting For Loop.
        System.out.print("Decreaminate : ");
        for (int d = sc.nextInt(); d>0; d--){
            System.out.println(d);
        }

        //System.out.print("Natural Numbers in Rverse order");
        sc.close();
    }
}
