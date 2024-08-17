package odevler.bolum01;

public class Q04 {
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 2;
        int sayi3 = 3;
        int sayi4 = 4;
        int sayi5 = (int) Math.pow(sayi1,sayi2);
        int sayi6 = (int) Math.pow(sayi2,sayi2);
        int sayi7 = (int) Math.pow(sayi3,sayi2);
        int sayi8 = (int) Math.pow(sayi4,sayi2);
        int sayi9 = (int) Math.pow(sayi1,sayi3);
        int sayi10 = (int) Math.pow(sayi2,sayi3);
        int sayi11 = (int) Math.pow(sayi3,sayi3);
        int sayi12 = (int) Math.pow(sayi4,sayi3);
        int[] list1 = {sayi1, sayi5, sayi9};
        int[] list2 = {sayi2, sayi6, sayi10};
        int[] list3 = {sayi3, sayi7, sayi11};
        int[] list4 = {sayi4, sayi8, sayi12};
        System.out.println (Arrays.toString(list1));
        System.out.println (Arrays.toString(list2));
        System.out.println (Arrays.toString(list3));
        System.out.println (Arrays.toString(list4));

    }
}
