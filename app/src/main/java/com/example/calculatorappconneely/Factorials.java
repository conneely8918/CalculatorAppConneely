package com.example.calculatorappconneely;
import java.util.Scanner;
/**All credit goes to APCSA Factorials assignment last year.
 * I copied the code to create this functionality.
 */
public class Factorials extends Calculator {
    private int num;
    private int product;

    //Ask the user for a non-negative integer.

    //Scanner scan = new Scanner(System.in);
    //System.out.print("Input a non-negative integer: ");
    //num = scan.nextInt();
    //product = num;

    // compute and print the factorial of that integer using a while loop.
    public int factorial(){
        while (num > 1){
            num--;
            product *= num;
        }
        if (num == 0){
            product = 1;
        }
        return product;
    }
}