import java.util.Scanner;
public class cwh_18_switchcase {
    public static void main(String[] args) {
        String var = "Saurabh";
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to get a job!");
                break;
            case 60:
                System.out.println("You are going to retire!");
                break;
            default:
                System.out.println("Enjoy your Life!");
        }
        System.out.println("Thanks for using my Java Code");*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        if(age>30){
            System.out.println("You are eligible for this job.");
        }
        else if (age>26) {
            System.out.println("You are semi-experienced for this job.");
        }
        else if (age>22) {
            System.out.println("You are a Fresher.");
        } else{
            System.out.println("You are NOT eligible for this job.");*/

    }
}
