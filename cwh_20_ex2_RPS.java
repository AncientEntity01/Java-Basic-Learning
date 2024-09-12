import java.util.Random;
import java.util.Scanner;
public class cwh_20_ex2_RPS {
    public static void main(String[] args) {
        //A Rock,Paper,Scissor game with Rock,Paper,Scissor assigned to numbers 0,1 and 2.
        Random rd = new Random();
        Scanner sc= new Scanner(System.in);
        /*int i1 = sc.nextInt();
        //1rst Way
        int rni = rd.nextInt(3);
        if (i1==0 && rni==0 ){
            System.out.println(i1+" X "+rni);
            System.out.println("Rock Vs Rock : Draw");
        } else if (i1==1 && rni==1) {
            System.out.println(i1+" X "+rni);
            System.out.println("Paper Vs Paper : Draw");
        } else if (i1==2 && rni==2) {
            System.out.println(i1+" X "+rni);
            System.out.println("Scissor Vs Scissor : Draw");
        } else if (i1==0 && rni==1) {
            System.out.println(i1+" X "+rni);
            System.out.println("Rock Vs Paper : PC Won");
        } else if (i1==0 && rni==2) {
            System.out.println(i1+" X "+rni);
            System.out.println("Rock Vs Scissor : You Won");
        } else if (i1==1 && rni==0) {
            System.out.println(i1+" X "+rni);
            System.out.println("Paper Vs Rock : You Won");
        } else if (i1==1 && rni==2) {
            System.out.println(i1+" X "+rni);
            System.out.println("Paper Vs Scissor : PC Won");
        } else if (i1==2 && rni==0) {
            System.out.println(i1+" X "+rni);
            System.out.println("Scissor Vs Rock : PC Won");
        } else if (i1==2 && rni==1) {
            System.out.println(i1+" X "+rni);
            System.out.println("Scissor Vs Paper : You Won");
        }else{
            System.out.println("Error : Input values between 0 to 2");
        }*/
        //2nd Way
        /*if (i1==0){
            System.out.print("Rock");
        } else if (i1==1) {
            System.out.print("Paper");
        } else if (i1==2) {
            System.out.print("Scissor");
        }else{
            System.out.println("Error : Input values between 0 to 2");
        }
        int rni = rd.nextInt(3);
        if (i1==0 && rni==0 ){
            System.out.println(" Vs Rock : Draw");
        } else if (i1==1 && rni==1) {
            System.out.println(" Vs Paper : Draw");
        } else if (i1==2 && rni==2) {
            System.out.println(" Vs Scissor : Draw");
        } else if (i1==0 && rni==1) {
            System.out.println(" Vs Paper : PC Won");
        } else if (i1==0 && rni==2) {
            System.out.println(" Vs Scissor : You Won");
        } else if (i1==1 && rni==0) {
            System.out.println(" Vs Rock : You Won");
        } else if (i1==1 && rni==2) {
            System.out.println(" Vs Scissor : PC Won");
        } else if (i1==2 && rni==0) {
            System.out.println(" Vs Rock : PC Won");
        } else if (i1==2 && rni==1) {
            System.out.println(" Vs Paper : You Won");
        }*/
        //3rd Way
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int i1 = sc.nextInt();

        if (i1 < 0 || i1 > 2) {
            System.out.println("Error: Please input values between 0 and 2");
            sc.close();
            return;      // Exit the program early
        }

        if (i1 == 0) {
            System.out.print("You chose Rock");
        } else if (i1 == 1) {
            System.out.print("You chose Paper");
        } else if (i1 == 2) {
            System.out.print("You chose Scissor");
        }

        int rni = rd.nextInt(3);
        if (rni == 0) {
            System.out.println(" Vs Rock");
        } else if (rni == 1) {
            System.out.println(" Vs Paper");
        } else if (rni == 2) {
            System.out.println(" Vs Scissor");
        }

        // Determine the winner
        if (i1 == rni) {
            System.out.println("Result: Draw");
        } else if ((i1 == 0 && rni == 2) || (i1 == 1 && rni == 0) || (i1 == 2 && rni == 1)) {
            System.out.println("Result: You Won");
        } else {
            System.out.println("Result: PC Won");
        }

        sc.close();
    }
}
