import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite number? ");
        int num = Integer.parseInt(scan.next());
        System.out.println("Cool! My favorite number is "+(num*2)+'.');
        scan.close();
    }
}
