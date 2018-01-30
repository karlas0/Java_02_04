package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite du sveikuosius skaicius");

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite pirmaji skaiciu");

        int a = sc.nextInt();

        System.out.println("Iveskite antraji skaiciu");

        int b = sc.nextInt();

        System.out.println("Ju suma");

        System.out.println(a + b);

        System.out.println("Ju skirtumas");

        System.out.println(skirtumas(a,b));


    }

    public static int skirtumas(int a, int b) {
        return a - b;
    }
}
