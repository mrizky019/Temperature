package com.java.temperature;

import java.util.Scanner;

public class Main {

    static float numberConvertion(String input) {
        float suhu = 0;

        try {
            suhu = Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Degrees is not legal floating point number");
            System.exit(0);
        }
        return suhu;
    }

    public static void main(String[] args) {
        String input;

        Scanner sc = new Scanner(System.in);
        Temperature temperature;

        System.out.println("Choose The Temperature Conversion :");
        System.out.println("1. Celcius to Fahrenheit :");
        System.out.println("2. Fahrenheit to Celcius");
        System.out.print("Input menu : ");
        int menu = sc.nextInt();

        if (menu == 1) {
            temperature = new Fahrenheit();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Current Celcius Temperature : ");
            input = scanner.nextLine();
            System.out.println("Fahrenheit Temperature is : " + temperature.hitungSuhu(numberConvertion(input)) + "\u00B0");
        } else {
            temperature = new Celcius();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Current Fahrenheit Temperature : ");
            input = scanner.nextLine();
            System.out.println("Celcius Temperature is :  : " + temperature.hitungSuhu(numberConvertion(input)) + "\u00B0");
        }
    }
}
