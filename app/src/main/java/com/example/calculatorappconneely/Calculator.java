package com.example.calculatorappconneely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Scanner;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int numInput;
    private int shownInput;
    private boolean operationSelected = false;
    private int num1,num2;
    public static void main (String[]args){

    }
    /** The function numSelected differentiate between various button inputs.
     * @param v the screen view
     * Source: Denna "One Method, Many Uses" Example
     */
    public void numSelected(View v) {
        if(v.getId() == R.id.buttonFor1) {
            Log.i("User", "Selected 1");
            numInput = 1;
        } else if(v.getId() == R.id.buttonFor2) {
            Log.i("User", "Selected 2");
            numInput = 2;
        } else if(v.getId() == R.id.buttonFor3) {
            Log.i("User", "Selected 3");
            numInput = 3;
        } else if(v.getId() == R.id.buttonFor4) {
            Log.i("User", "Selected 4");
            numInput = 4;
        } else if(v.getId() == R.id.buttonFor5) {
            Log.i("User", "Selected 5");
            numInput = 5;
        }else if(v.getId() == R.id.buttonFor6) {
            Log.i("User", "Selected 6");
            numInput = 6;
        } else if(v.getId() == R.id.buttonFor7) {
            Log.i("User", "Selected 7");
            numInput = 7;
        }else if(v.getId() == R.id.buttonFor8) {
            Log.i("User", "Selected 8");
            numInput = 8;
        } else if(v.getId() == R.id.buttonFor9) {
            Log.i("User", "Selected 9");
            numInput = 9;
        } else if(v.getId() == R.id.buttonFor0) {
            Log.i("User", "Selected 0");
            numInput = 0;
        } else{
            Log.i("User","Selected A_Button_Without_Functionality");
        }


        if(operationSelected) { //the user has hit an operator button
            if(String.valueOf(num2).length() >= 1) {
                num2 *= 10;
                num2 += numInput;
            }
            else{
                num2 += numInput;
            }
        } else {
            if(String.valueOf(num1).length() >= 1) {
                num1 *= 10;
                num1 += numInput;
            }
            else{
                num1 += numInput;
            }
        }
        displayText(v); //Display the additional user input
    }
    String operation;
    public void operationSelected(View v){
        if (v.getId() == R.id.buttonForExponent){
            operation = "^";
        }
        else if(v.getId() == R.id.buttonForAddition){
            operation = "+";
        }
        else if (v.getId() == R.id.buttonForSubtraction){
            operation = "-";
        }
        else if (v.getId() == R.id.buttonForMultiplication){
            operation = "*";
        }
        else if (v.getId() == R.id.buttonForDivision){
            operation = "/";
        }
        operationSelected = true;
    }

    public void displayText(View v){
        // inputTextView > inputString > inputInteger > math > output integer > outputString > outputTextView
        String UI_Input = String.valueOf(num1);
        if (operationSelected){
            UI_Input += operation;
        }
        UI_Input += String.valueOf(num2);
        Log.i("UI", "Input should be "+UI_Input);

        // make a reference to the TextView by locating it with its id
        TextView UI_InputTV = findViewById(R.id.UIInputTextView);
        UI_InputTV.setText(UI_Input);


        //SOURCE: Stackoverflow answer for how to set a textView which happens to use an editText
        //editText.setText("Hello world!");TODO:Set the TextView to the Output (& get output from input)
        //editText.setText(R.string.hello_world);

        //TODO:Make output functional; this commented-out-code is a patch
        /*
        // make a reference to the TextView by locating it with its id
        TextView UI_OutputTV = findViewById(R.id.UIOutputTextView);
        String UI_Output = UI_OutputTV.getText().toString(); //xml:UIOutput_TextView, java: UI_OutputTV, str: UI_output
        int output = Integer.parseInt(UI_Output);
        */
    }
    /** Tests the factorials function.
     * All credit to the factorials assignment from APCSA last year. This code is copied from that.
     */
    /*
    public static void FactorialsTester() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a non-negative integer: ");
        int num = scan.nextInt();
        int product = num;
        System.out.print("Factorial of " + num + ": " + factorial(num));
    }
    */
}