package com.java.learn;

public class test_boollean {
    static public void main(String[] args) {
        boolean a, b, c, d;
        for (int i = 0; i < 16; i++) {
            //System.out.println();
            d = i % 2 == 1;
            c = ((i / 2) % 2 == 1);
            b = (i / 4) % 2 == 1;
            a = ((i / 8) % 2 == 1) ;
            System.out.print(a); System.out.print(' ');
            System.out.print(b); System.out.print(' ');
            System.out.print(c); System.out.print(' ');
            System.out.print(d); System.out.print(" -> ");
            System.out.println(var(a, b, c, d));
        }
    }

    private static boolean var(boolean a, boolean b, boolean c, boolean d) {
        return (((a ^ b) & (c ^ d)) | ((a ^ d) & (c ^ b)) | ((a ^ c) & (b ^ d)));
    }

}