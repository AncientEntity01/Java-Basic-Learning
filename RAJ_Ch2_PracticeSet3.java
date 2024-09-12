import java.lang.String;

public class RAJ_Ch2_PracticeSet3 {
    public static void main(String[] args) {
        //Problem 1
        String name = "John Stephens";
        name = name.toLowerCase();
        System.out.println(name);
        //Problem 2
        String text = "I have to work hard";
        text = text.replace(' ','_');
        System.out.println(text);
        //Problem 3
        String letter= "Dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>","Maa");
        System.out.println(letter);
        //Problem 4
        String Spaces ="The  string   contains  double  and   triple   spaces";
        System.out.println((Spaces.indexOf("  ")));
        System.out.println(Spaces.indexOf("   "));
        //Problem 5
        String mmyLetter = "Dear Raj,\n\tThis Java course is nice.\nThank You!";
        System.out.println(mmyLetter);
    }
}
