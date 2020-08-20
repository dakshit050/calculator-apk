package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input,signBox;
    Double num1,num2,result;
    String value1,value2,sign;
    boolean dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input= (TextView) findViewById(R.id.input);
        signBox = (TextView)findViewById(R.id.sign);
        dot=false;
    }
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }

    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }

    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }

    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }

    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }


    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }


    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }


    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }


    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }


    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }
    public void btnClick_dot(View view) {
        if (!dot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            dot = true;
        }

    }
    public void btnClick_log(View view) {
        sign = "log";
        input.setText(null);
        signBox.setText("log");
        dot = false;
    }

    public void btnClick_ln(View view) {
        sign = "ln";
        input.setText(null);
        signBox.setText("ln");
        dot = false;
    }

    public void btnClick_power(View view) {
        sign = "power";
        value1 = input.getText().toString();
        input.setText(null);
        dot = false;
        signBox.setText("xⁿ");
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        input.setText(null);
        dot = false;
        signBox.setText("!");
    }
    public void btn_sign(View view){
        sign="sin";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("sin");
        dot=false;
    }
    public void btn_cos(View view){
        sign="cos";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("cos");
        dot=false;
    }
    public void btnClick_root(View view) {
        sign = "root";
        input.setText(null);
        dot = false;
        signBox.setText("√");
    }
    public void btn_tan(View view){
        sign="tan";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("tan");
        dot=false;
    }
    public void btnClick_add(View view){
        sign="+";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("+");
        dot=false;
    }
    public void btnClick_sub(View view){
        sign="-";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("-");
        dot=false;
    }
    public void btnClick_mult(View view){
        sign="*";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("x");
        dot=false;
    }
    public void btnClick_div(View view){
        sign="/";
        value1=input.getText().toString();
        input.setText(null);
        signBox.setText("÷");
        dot=false;
    }
    public void btnClick_qual(View view){
        if(sign==null){
            signBox.setText("0");
        }else if(signBox.getText().equals("")){
            signBox.setText(signBox.getText().toString());
        }else if((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")){
            signBox.setText(value1);
        }else {
            switch (sign){
                case "+":
                    value2=input.getText().toString();
                    num1=Double.parseDouble(value1);
                    num2=Double.parseDouble(value2);
                    result=num1+num2;
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "sin":
                    value1=input.getText().toString();
                    num1= Double.parseDouble(value1);
                    result=Math.sin(num1);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1=input.getText().toString();
                    num1= Double.parseDouble(value1);
                    result=Math.cos(num1);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1=input.getText().toString();
                    num1= Double.parseDouble(value1);
                    result=Math.tan(num1);
                    input.setText(result+"");
                    sign=null;
                    signBox.setText(null);
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signBox.setText(null);
                    break;

            }
        }
    }
    public void btnClick_delete(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                dot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {

        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        dot = false;
    }

}