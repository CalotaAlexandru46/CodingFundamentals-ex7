import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String parola= input.nextLine();
        Pattern p1=Pattern.compile("[a-z]");
        Pattern p2=Pattern.compile("[A-Z]");
        Pattern p3=Pattern.compile(("[0-1]"));
        Matcher m1=p1.matcher(parola);
        Matcher m2=p2.matcher(parola);
        Matcher m3=p3.matcher(parola);

        if(m1.find() && m2.find() && m3.find() && parola.length()>=6){
            System.out.println("Parola valida!");
        } else {
            System.out.println("Parola invalida!");
        }

    }
}
