/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author juuso_j0pbwen
 */
public class IO {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getString() {
        return scanner.nextLine();
    }
    
    public static int getNumber() {
        return Integer.parseInt(scanner.nextLine());
    }
    
    public static int getForcedNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Something went wrong. You have to input a number.");
                System.out.print("Try again:");
            }
        }
    }
    
    public static void println(Object message) {
        System.out.println(message);
    }
    
    public static void print(String message) {
        System.out.print(message);
    }
    
}
