package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a tempature in Celcius: ");
        Scanner UserInput = new Scanner(System.in);
        double Input = UserInput.nextInt();
        System.out.println(Input+" C = "+(Input*(9.0/5.0)+32)+" F");
    }
}
