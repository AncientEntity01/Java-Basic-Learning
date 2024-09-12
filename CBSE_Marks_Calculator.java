import java.util.Scanner;

public class CBSE_Marks_Calculator {
    public static void main(String[] args) {
        System.out.println("CBSE Board Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Marks");
        int FullM = sc.nextInt();
        System.out.println("Enter Subject 1 Marks");
        float S1 = sc.nextFloat();
        System.out.println("Enter Subject 2 Marks");
        float S2 = sc.nextFloat();
        System.out.println("Enter Subject 3 Marks");
        float S3 = sc.nextFloat();
        System.out.println("Enter Subject 4 Marks");
        float S4 = sc.nextFloat();
       System.out.println("Enter Subject 5 Marks");
       float S5 = sc.nextFloat();
        int NSub = 5*FullM;
        float Total = S1+S2+S3+S4+S5;
        float Percent = (Total/NSub)*100;
        System.out.println("The Percentage ofhj Marks the Candidate got -:");
        System.out.println(Percent +"%");
    }
}
