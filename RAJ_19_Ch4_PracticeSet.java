
import java.lang.String;

public class RAJ_19_Ch4_PracticeSet {
    public static void main(String[] args) {
       // int a = 10;
        //Quiestion 1 answer
        /*if (a == 11) {
            System.out.println("I am 11");
        }else {
            System.out.println("I am not 11");
        }*/
        //Question 2 answer
        /*Byte Sub1, Sub2, Sub3;
        char sign ='%';
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject 1 = ");
        Sub1 = sc.nextByte();
        System.out.print("Subject 2 = ");
        Sub2 = sc.nextByte();
        System.out.print("Subject 3 = ");
        Sub3 = sc.nextByte();
        float Total = Sub1+Sub2+Sub3;
        float Percent = (Total/300)*100 ;
        System.out.println("Total Percentage = "+Percent+"%");
        String P = "Passed";
        String F = "Failed";
        if (Sub1>=33 && Sub2 >=33 && Sub3>=33 && Percent>=40) {
            System.out.println(P);
        }else{
            System.out.println(F);
        }*/
        //Question 3 answer
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income in Lakhs per Annum : ");
        float tax = 0;
        float Income = sc.nextFloat();
        if (Income<=2.5f){
            tax = tax+0;
        } else if (Income>2.5f && Income<=5.0f) {
            tax=tax+0.05f*(Income-2.5f);
        } else if (Income>5.0f && Income<=10.0f) {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(Income-5f);
        } else if (Income>10.0f) {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5f);
            tax=tax+0.3f*(Income-10.0f);
        }
        System.out.println("The Total Tax to be be paid : "+tax);*/
        //Question 4 Answer
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Day Number : ");
        int Day = sc.nextInt();
        switch (Day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuseday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            }*/

        //Question 5 Answer
        /*System.out.println("Enter the year to be checked");
            Scanner s=new Scanner(System.in);
            int yr= s.nextInt();
            if((yr%4==0 && yr%100!=0)|| yr%400==0){
              System.out.println("Leap year");
            }else{
             System.out.println("Not a leap year");
    }*/

        //Question 6 Answer
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Website Here : ");
        String Web = sc.nextLine();
        boolean type1 = Web.endsWith(".com");
        boolean type2 = Web.endsWith(".org");
        boolean type3 = Web.endsWith(".in");
        if (type1==true){
            System.out.println("This is a Commercial Website.");
        } else if (type2==true) {
            System.out.println("This is a Organisation Website.");
        } else if (type3==true) {
            System.out.println("This is an Indian Website.");
        }else{
            System.out.println("Error : Check Your Input.");
        }
        sc.close();*/
    }
    }
