package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2;
    private double first;
    private double second;
    private double result;
    private String operation;
    private String answer;
    private Button Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button0, ButtonBackSpace, ButtonClear, ButtonPlus, ButtonMinus, ButtonMultipy, ButtonDivide, ButtonPercent, ButtonEqual, ButtonDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        Button0 = findViewById(R.id.button0);
        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);
        Button7 = findViewById(R.id.button7);
        Button8 = findViewById(R.id.button8);
        Button9 = findViewById(R.id.button9);
        ButtonBackSpace = findViewById(R.id.buttonbackspace);
        ButtonClear = findViewById(R.id.buttonClear);
        ButtonPercent = findViewById(R.id.buttonpercentage);
        ButtonMinus = findViewById(R.id.buttonminus);
        ButtonMultipy = findViewById(R.id.buttonmultiply);
        ButtonDivide = findViewById(R.id.buttondivide);
        ButtonDot = findViewById(R.id.buttondot);
        ButtonEqual = findViewById(R.id.buttonequal);
        ButtonPlus = findViewById(R.id.buttonadd);

        ButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(null);
                textView2.setText(null);
            }
        });
        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button0.getText().toString();
                textView2.setText(text);
            }
        });
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button1.getText().toString();
                textView2.setText(text);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button2.getText().toString();
                textView2.setText(text);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button3.getText().toString();
                textView2.setText(text);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button4.getText().toString();
                textView2.setText(text);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button5.getText().toString();
                textView2.setText(text);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button6.getText().toString();
                textView2.setText(text);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button7.getText().toString();
                textView2.setText(text);
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button8.getText().toString();
                textView2.setText(text);
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + Button9.getText().toString();
                textView2.setText(text);
            }
        });
        ButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView2.getText().toString() + ButtonDot.getText().toString();
                textView2.setText(text);
            }
        });
        ButtonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Backspace = null;
                if(textView2.getText().length() > 0)
                {
                    StringBuilder stringBuilder = new StringBuilder(textView2.getText());
                    stringBuilder.deleteCharAt(textView2.getText().length()-1);
                    Backspace = stringBuilder.toString();
                    textView2.setText(Backspace);
                }
            }
        });
        ButtonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String percentage;
                first = Double.parseDouble((String) textView2.getText());
                percentage = String.format("%.2f", first);
                textView1.setText(percentage);
                textView2.setText("");
                operation = "%";
            }
        });
        ButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String percentage;
                first = Double.parseDouble((String) textView2.getText());
                percentage = String.format("%.2f", first);
                textView1.setText(percentage);
                textView2.setText("");
                operation = "-";
            }
        });
        ButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String percentage;
                first = Double.parseDouble((String) textView2.getText());
                percentage = String.format("%.2f", first);
                textView1.setText(percentage);
                textView2.setText("");
                operation = "+";
            }
        });
        ButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String percentage;
                first = Double.parseDouble((String) textView2.getText());
                percentage = String.format("%.2f", first);
                textView1.setText(percentage);
                textView2.setText("");
                operation = "/";
            }
        });
        ButtonMultipy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String percentage;
                first = Double.parseDouble((String) textView2.getText());
                percentage = String.format("%.2f", first);
                textView1.setText(percentage);
                textView2.setText("");
                operation = "*";
            }
        });
        ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String) textView2.getText());
                if(operation == "+")
                {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation == "-")
                {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation == "*")
                {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation == "/")
                {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
                if(operation == "%")
                {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textView2.setText(answer);
                    textView1.setText(null);
                }
            }
        });
    }
}