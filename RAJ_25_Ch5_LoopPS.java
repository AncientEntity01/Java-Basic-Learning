import java.util.Scanner;
public class RAJ_25_Ch5_LoopPS {
    public static void main(String[] args) {
        /* Write a program to draw the following pattern:
         ****
         ***
         **
         *
         */
       /* int s = 4;
        for (int t = s; t > 0; t--) {
            for (int a = 0; a < t; a ++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
        //OR
          /*for (int i=0; i<4; i++){
              if (i==0) {
                  System.out.println("****");
                  continue;
              } else if (i==1) {
                  System.out.println("***");
                  continue;
              } else if (i==2) {
                  System.out.println("**");
                  continue;
              } else if (i==3) {
                  System.out.println("*");
                  break;
              }
          }*/
        /*Write a program to sum first n even numbers using while loop.*/
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter the number of even numbers you want sum of : ");
        int sum = 0;
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            sum = sum + (2 * i);
            i++;
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        sc.close();*/

        /*Write a program to print multiplication table of a given number*/
       /* System.out.print("Multiplication table of : ");
        int m = sc.nextInt();
        for (int p = 1; p < 11; p++) {
            int into = m * p;
            System.out.println(m + " X " + p + " = " + into);
        }
        sc.close();*/
    /* Write a program to find multiplication table of 10 in reverse order.*/
        /*System.out.println("The Reverse multiplication table of 10 : ");
        int r = 10;
        for (int o=10; o>0; o--){
            int rev = r*o;
            System.out.println(r+" X "+o+" = "+rev);
        }
        sc.close();*/
    /*Write a program to find factorial of a given number using for loops.*/
       // int n = sc.nextInt();
// What is factorial n = n * n-1 * n-2 ..... 1
// 5! = 5*4*3*2*1 = 120
        /*int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);*/
    /* Repeat 5 using while loop.*/
        /*System.out.println("Enter the number : ");
        int five = sc.nextInt();
        while (five==5){
            System.out.println(five);
        }sc.close();*/
/*Repeat 1 using for/while loop.*/
        /*System.out.println("Enter the number : ");
        int one = sc.nextInt();
        for(one=1; one>0;){
            System.out.println(one);
        }sc.close();*/
//Write a program to calculate the sum of the programs occuring in the multiplication table of 8:
        /*System.out.print("Multiplication table of 8 : ");
        int e = sc.nextInt();
        while (e==8 ){
            int sum = 55*e;
            System.out.println("Sum of the Table : "+sum);
            break;
        }
        sc.close();*/
        //OR
        /*int n = 8;
        int sum = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);*/
        /*a do while is executed
        1-> atleast once: True
        2-> atleast twice
        3-> atmost once
         */

    }
}