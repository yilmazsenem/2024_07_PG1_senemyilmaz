package odevler.bolum01;

public class Q04 {
    public static void main(String[] args) {
        int[][] table = new int[4][3];
        table [0][0] = 1;
        table [1][0] = 2;
        table [2][0] = 3;
        table [3][0] = 4;

        table[0][1] = (int) Math.pow(table[0][0],table[1][0]);
        table[0][2] = (int) Math.pow(table[0][0],table[2][0]);

        table[1][1] = (int) Math.pow(table[1][0],table[1][0]);
        table[1][2] = (int) Math.pow(table[1][0],table[2][0]);

        table[2][1] = (int) Math.pow(table[2][0],table[1][0]);
        table[2][2] = (int) Math.pow(table[2][0],table[2][0]);

        table[3][1] = (int) Math.pow(table[3][0],table[1][0]);
        table[3][2] = (int) Math.pow(table[3][0],table[2][0]);

        System.out.println(table[0][0] + " " + table[0][1] + " " + table[0][2]);
        System.out.println(table[1][0] + " " + table[1][1] + " " + table[1][2]);
        System.out.println(table[2][0] + " " + table[2][1] + " " + table[2][2]);
        System.out.println(table[3][0] + " " + table[3][1] + " " + table[3][2]);
    }}

