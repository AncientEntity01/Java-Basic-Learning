import java.util.Scanner;
public class RAJ_22_Ch5_DoWhileLoop {
    public static void main(String[] args) {
        /*int b = 0;
        while (b < 5) {
            System.out.println(b);
            b++;
        }

        int a = 10;
        do {
            System.out.println(a);
            a++;
        } while (a < 5);*/

        //quiz 2 : Find first n number of natural numbers.
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int nnum= sc.nextInt();
        do {
            System.out.println(c);
            c++;
        } while (c <= nnum);
        }
    }
