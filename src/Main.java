import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String parola= input.nextLine();
        Pattern p=Pattern.compile("[a-z][A-Z][0-9]");
        Matcher m=p.matcher(parola);
        if(m.find()&&parola.length()>=6){
            System.out.println("Parola valida!");
        } else {
            System.out.println("Parola invalida!");
        }

    }
}
