package com.example.calculatorappconneely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int numInput;
    private int shownInput;
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
        shownInput *= 10;
        shownInput += numInput;
        Log.i("User", "Input "+shownInput);

        String UI_Input = String.valueOf(shownInput);

        //editText.setText("Hello world!");TODO:Set the TextView to the Output (& get output from input)
        //editText.setText(R.string.hello_world);
        TextView UI_TV = findViewById(R.id.UIInputTextView);
        // inputTextView > inputString > inputInteger > math > output integer > outputString > outputTextView
        // make a reference to the TextView by locating it with its id
        TextView UI_OutputTV = findViewById(R.id.UIOutputTextView);
        String UI_Output = UI_OutputTV.getText().toString(); //xml:UIOutput_TextView, java: UI_OutputTV, str: UI_output
        int output = Integer.parseInt(UI_Output);
    }
}