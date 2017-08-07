package com.company;

import Sub.DataTransaksi;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 0;
        boolean menu = true;
        DataTransaksi dt = new DataTransaksi();
        while (menu){
            System.out.printf("1.Input Data \n" +
                    "2.Output Data\n" +
                    "3.Reset Data\n" +
                    "4.Exit\n");
            System.out.printf("Input : ");input = sc.nextInt();
            switch (input){
                case 1 : dt.inputData();break;
                case 2 : dt.outputData();break;
                case 3 : dt = new DataTransaksi();break;
                case 4 : menu = false;
            }
        }
    }
}
