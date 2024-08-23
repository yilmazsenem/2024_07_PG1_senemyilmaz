package odevler.bolum01;

public class Q11 {
    public static void main(String[] args) {
        int population2024 = 312032486;
        double totalsecondsinaday = (24.0*60.0*60.0);
        double totalbirthsinaday = ((totalsecondsinaday)/7.0);
        double totaldeathsinaday = ((totalsecondsinaday)/13.0);
        double totalimmigrants = ((totalsecondsinaday)/45.0);
        double population2025 = ((population2024)+(totalbirthsinaday)-(totaldeathsinaday)+(totalimmigrants));
        double population2026 = ((population2025)+(totalbirthsinaday)-(totaldeathsinaday)+(totalimmigrants));
        double population2027 = ((population2026)+(totalbirthsinaday)-(totaldeathsinaday)+(totalimmigrants));
        double population2028 = ((population2027)+(totalbirthsinaday)-(totaldeathsinaday)+(totalimmigrants));
        double population2029 = ((population2028)+(totalbirthsinaday)-(totaldeathsinaday)+(totalimmigrants));
        System.out.println (population2025);
        System.out.println (population2026);
        System.out.println (population2027);
        System.out.println (population2028);
        System.out.println (population2029);




    }
}
