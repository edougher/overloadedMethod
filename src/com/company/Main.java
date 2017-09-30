package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        getInput();
        int input = in.nextInt();
        inputSwitch(input);
    }


    public static void getInput() {
        System.out.println("1: Are you Residential customer?");
        System.out.println("2: Are you a Business customer?");
    }

    static void inputSwitch(int input) {
        switch (input){
            case 1:
                getInfoRes();
                break;
            case 2:
                getInfoBiz();
                break;
        }
    }


    public static void getInfoRes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input1 = in.nextLine();
        System.out.println("Enter your phone number: ");
        String input2 = in.nextLine();

        System.out.println(input1);
        System.out.println(input2);

    }
    public static void getInfoBiz() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter business name: ");
        String input1 = in.nextLine();
        System.out.println("Enter contact name: ");
        String input2 = in.nextLine();
        System.out.println("Enter contact phone number: ");
        String input3 = in.nextLine();

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }

}
