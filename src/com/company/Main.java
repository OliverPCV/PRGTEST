package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej větu");
        String input = sc.nextLine();

        if (input.contains("AB") && input.contains("BA")){
            System.out.println("ANO");
            /*if (input.indexOf("AB") != 1 && input.indexOf("BA") != 1){
                System.out.println("ANO");
            }else System.out.println("NE");*/
        } else System.out.println("NE");



    }
}
