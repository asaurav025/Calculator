package com.sauravagrawal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calc extends Activity {
    public String str = "";
    Character op = 'q';
    double i,num, numtemp;
    EditText showResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        showResult = (EditText)findViewById(R.id.result);
    }
    public void zeroClicked(View v){
        insert(0);
    }

    public void oneClicked(View v){
        insert(1);
    }

    public void twoClicked(View v){
        insert(2);
    }

    public void threeClicked(View v){
        insert(3);
    }

    public void fourClicked(View v){
        insert(4);
    }

    public void fiveClicked(View v){
        insert(5);
    }

    public void sixClicked(View v){
        insert(6);
    }

    public void sevenClicked(View v){
        insert(7);
    }

    public void eightClicked(View v){
        insert(8);
    }

    public void nineClicked(View v){
        insert(9);
    }
    public void addClicked(View v){
        perform();
        op = '+';
    }
    public void decClicked(View v){
        str= str+'.';
        num = Double.valueOf(str).doubleValue();
        showResult.setText(str);
    }
    public void subClicked(View v){
        perform();
        op = '-';
    }
    public void divClicked(View v){
        perform();
        op = '/';
    }
    public void mulClicked(View v){
        perform();
        op = '*';
    }
    public void equalClicked(View v){
        calculate();
    }
    public void clearClicked(View v){
        resetcurrent();
    }
    public void cl_memClicked(View v){
        reset();
    }

    private void reset(){
        str = "";
        op = 'q';
        num = 0;
        numtemp = 0;
        showResult.setText("");

    }
    private void insert(int j){
        str = str+Integer.toString(j);
        num = Double.valueOf(str).doubleValue();
        showResult.setText(str);
    }

    private void perform(){
        str = "";
        numtemp = num;

    }

    private void calculate(){
        if(op == '+')
            num = numtemp + num;
        else if (op == '-')
            num = numtemp - num;
        else if(op == '/')
            num = numtemp/num;
        else if (op == '*')
            num = numtemp*num;

        showResult.setText(""+num);
    }
    private void resetcurrent(){
        str = "";
        num = 0;
        showResult.setText("");
    }
}
