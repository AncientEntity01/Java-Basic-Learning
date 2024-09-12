public class RAJ_24_Ch5_BreakAndContinue {
    public static void main(String[] args) {
        //Break and Continue using loop.
        /*for (int i = 0; i<10; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i==8){
                System.out.println("Ending the Loop.");
                break;
            }
        }*/
       /* int i=0;
        while(i<6){
            System.out.println(i);
            System.out.println("Java is Great");
            if (i==3){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("TheLoop Ends Here");*/
       /* for(int i=7;i>0;i--) {
            if (i == 3) {
                continue;//continue skips the rest statement
            }
            System.out.println(i);
        }*/
        for (int i = 0; i <= 20; i++) {
            if (i == 11) {
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
    }
}
