package com.example.SimpleCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private enum Operator{none, add, minus, multiply, divide}
    private double data1 = 0;
    private Operator optr = Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void btn00Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }
    @SuppressLint("SetTextI18n")
    public void btn01Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }
    @SuppressLint("SetTextI18n")
    public void btn02Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }
    @SuppressLint("SetTextI18n")
    public void btn03Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }
    @SuppressLint("SetTextI18n")
    public void btn04Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }
    @SuppressLint("SetTextI18n")
    public void btn05Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }
    @SuppressLint("SetTextI18n")
    public void btn06Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }
    @SuppressLint("SetTextI18n")
    public void btn07Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }
    @SuppressLint("SetTextI18n")
    public void btn08Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }
    @SuppressLint("SetTextI18n")
    public void btn09Click(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }
    public void btnResultClick(View view){
        if(optr != Operator.none){
            EditText eText = findViewById(R.id.resultEdit);
            double data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1 + data2;
            } else if(optr == Operator.minus){
                result = data1 - data2;
            }else if(optr == Operator.multiply){
                result = data1 * data2;
            }
            else if(optr == Operator.divide){
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;
            if((result-(int)result)!=0)
                eText.setText(String.valueOf(result));
            else
                eText.setText(String.valueOf((int)result));
        }
    }
    public void btnAddClick(View view){
        optr = Operator.add;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");

    }
    public void btnMinusClick(View view){
        optr = Operator.minus;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMultiplyClick(View view){
        optr = Operator.multiply;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view){
        optr = Operator.divide;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnClearClick(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText("");
    }
    @SuppressLint("SetTextI18n")
    public void btnDotClick(View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }
}