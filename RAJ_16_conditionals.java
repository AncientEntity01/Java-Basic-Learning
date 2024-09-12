import java.util.Scanner;

public class RAJ_16_conditionals {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 26) {
            if (age >= 21) {
                System.out.println("Yes, you are eligible for afcat exam!");
            } else {
                System.out.println("No you are too young for afcat exam!");
            }
        } else {
            System.out.println("No you are too old for afcat exam!");
        }
        
    }
}
