package odevler.bolum02;

import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number in pounds:  ");
        double userinputbypound = scanner.nextDouble();
        double outputbykg = userinputbypound* 0.454;
        System.out.println(userinputbypound + " " + "pound" + " " + "is" + " " + outputbykg + " " + "kilograms" + ".");


    }
}
