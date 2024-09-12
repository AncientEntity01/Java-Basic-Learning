import javax.naming.Name;
import java.util.Scanner;


public class cwh_12_Practiceset2_Ch2 {
    public static void main(String[] args) {
        float a = 7/4.0f*9/2.0f;
        System.out.println("Problem 1 = "+a);


        char grade = 'A';
        //Encrypting the grade
        grade = (char)(grade+8);
        System.out.println("Encrypted Value = "+grade);
        //Decrypting the grade
        grade = (char)(grade-8);
        System.out.println("Decrypted Value = "+grade);


        Scanner sc = new Scanner(System.in);
        System.out.println("Greater than 10 : true/false");
        int c = sc.nextInt();
        System.out.println(c>10);

        float v = sc.nextFloat();
        System.out.println("v = "+v);
        float u = sc.nextFloat();
        System.out.println("u = "+u);
        float z = sc.nextFloat();
        System.out.println("z = "+z);
        float s = sc.nextFloat();
        System.out.println("s = "+s);

        float Formula = (v*v-u*u)/2*z*s;
        System.out.println("Answer : "+Formula);

        



    }
}
