package odevler.bolum01;

public class Q10 {
    public static void main(String[] args) {
        double totalminute = ((45*60)+30);
        double minuteperkm = (totalminute/14);
        double averagespeed = (((minuteperkm)*1.6)/1.0);
        double byminute = ((averagespeed)/60);
        double byhour = ((byminute)/60);
        System.out.println(byhour);
    }
}
