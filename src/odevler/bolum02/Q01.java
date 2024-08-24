package odevler.bolum02;

import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a degree in Celsius:  ");
        double userinput = scanner.nextDouble();
        double fahrenheit = ((9.0 / 5) * (userinput + 32));
        System.out.println(userinput + " " + "is" +" " + fahrenheit + " " + "fahrenheit.");


    }
}
