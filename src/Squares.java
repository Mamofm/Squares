import java.util.Scanner;

public class Squares {
    public static void main(String args[]) {
    int num=0;

    Scanner keybd = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num  = keybd.nextInt();

    System.out.println ("Number           Square");
    System.out.println ("-----------    ---------");
    // use for loop
            for (int i=1; i <= num ; i++) {
             System.out.println (i + "                   " + (i*i));
    }
}
}