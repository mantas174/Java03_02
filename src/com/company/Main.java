package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String zodis;

        System.out.print("Iveskite zodi");
        zodis = in.nextLine();

        zodis = "";
        while( !zodis.equals("pabaiga")){
            System.out.print("Iveskite zodi");
            zodis = in.nextLine();

            System.out.print(zodis);
        }
    }
}
