import java.util.Scanner;

public class CWH_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toLowerCase());
        System.out.println(s.replace(' ', '_'));
        String letter = "Dear <|name|>, thanks a lot!!";
        letter = letter.replace("<|name|>", s);
        System.out.println(letter);

        String intro = "hello prats \nnice to meet you";
        System.out.println(intro);


    }
}
