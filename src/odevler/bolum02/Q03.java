package odevler.bolum02;

import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a value for feet:  ");
        double userinputbyfeet = scanner.nextDouble();
        double meteroutput = userinputbyfeet* 0.305;
        System.out.println(userinputbyfeet + " " + "feet" + " " + "is" + " " + meteroutput + " " + "meters" + ".");


    }
}
