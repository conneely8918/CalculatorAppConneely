package com.example.calculatorappconneely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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
    public void operatorSelected(View v){
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
    // to - do list for code:
    // 1.) get something to show up on the output screen if the user hits enter. SOMETHING.
    // 2.) if the user hits 1 then + then 3 then =, the output shows 4
    // 3.) single-operation subtraction, multiplication, division work
    // 4.) error-resistant
    // 5.) multiple-operation
    // 6.) exponent and factorial
    // 7.) compatible with most mobile screen sizes (2.5 by 4 inches up to 6 by 10 inches)
    // 8.) stats screen & median functionality
    public void functionSelected(View v){
        /*Logic for output-showing code: read the input as a string, (2) send it to output.
         *(2): if (3) + is found, add the numbers before and after the + sign
         * (3): search for operator characters and return a string solely of those operators (4).
         * (4): if two operators are next to each other or "..", show an error message on UI.
         */
        if (v.getId() == R.id.equalsButton){
            TextView UI_InputTV = findViewById(R.id.UIInputTextView);
            //for(int i = 0; i < UI_InputTV.length(); i++) {TODO: un-patch this.
                // parse input as num
                // while there isn't an operator, merge section as num
                //while(UI_InputTV.valueOf(i)!= "+, -, ^, *, /"){TODO: un-patch this.

                //}
            //}
            String tempInputString = UI_InputTV.getText().toString();
            displayResult(v,tempInputString); //TODO this is temporary. calculate first.
            calculate();//send the values
        }
        else if (v.getId() == R.id.function2Button){

        }

    }
    public void calculate(){
        //sort operator by type
        // if is exponent, find the exponent
        //if is subtraction, subtract
        //etc.
        //return result
    }

    /**Function displayResult() displays the modified input given by the calculate method.
     * @Param v the screen
     * Source: Original code, but information about how to write it is from Mobile App class
     */
    public void displayResult(View v, String result){
        String UI_Output = result; //String.valueOf()
        TextView UIOutputTV = findViewById(R.id.UIOutputTextView);
        UIOutputTV.setText(UI_Output);
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