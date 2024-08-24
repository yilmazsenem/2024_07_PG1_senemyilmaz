package odevler.bolum02;

import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the radius and length of a cylinder:   ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double pi = Math.PI;
        double area = radius*radius*pi;
        double volume = area*length;
        System.out.println("Area of cylinder is" + " " + area + " " + ".");
        System.out.println("Volume of cylinder is" + " " + volume + " " + ".");

    }
}
