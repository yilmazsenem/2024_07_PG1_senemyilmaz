package odevler.bolum01;

public class Q12 {
    public static void main(String[] args) {
        double totalseconds = ((60*60)+(40*60)+35);
        double secondsbyamile = ((totalseconds/24));
        double hoursbyamile = (((secondsbyamile)/60)/60);
        double convertmiletokm = (((hoursbyamile*1)/1.6));
        System.out.println(convertmiletokm);
    }
}
