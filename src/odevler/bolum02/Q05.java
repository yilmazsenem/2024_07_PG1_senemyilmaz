package odevler.bolum02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter the subtotal and gratuity rate:  ");
        double gratuityinput = scanner.nextDouble();
        double subtotal = scanner.nextDouble();
        double gratuityoutput = (subtotal*(gratuityinput/100));
        double total = (subtotal+gratuityoutput);
        System.out.println ("The gratuity is" + " " + gratuityoutput + " " + "TL" + " " + "and total is" + " " + total + " " + "TL.");

    }
}
