package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView result = (TextView)findViewById(R.id.Result);

        float a = Float.parseFloat(n1.getText().toString());
        float b = Float.parseFloat(n2.getText().toString());
        float res = a + b;
        result.setText(Float.toString(res));
        /*int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int resSum = num1 + num2;
        result.setText(Integer.toString(resSum));*/
    }

    public void onButtonClick2(View v) {
        EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView result = (TextView)findViewById(R.id.Result);

        float a = Float.parseFloat(n1.getText().toString());
        float b = Float.parseFloat(n2.getText().toString());
        float res = a - b;
        result.setText(Float.toString(res));
        /*EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView res = (TextView)findViewById(R.id.Result);

        int m1 = Integer.parseInt(n1.getText().toString());
        int m2 = Integer.parseInt(n2.getText().toString());
        int resSubtraction = m1 - m2;
        res.setText(Integer.toString(resSubtraction));*/
    }

    public void onButtonClick3(View v) {
        EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView result = (TextView)findViewById(R.id.Result);

        float a = Float.parseFloat(n1.getText().toString());
        float b = Float.parseFloat(n2.getText().toString());
        float res = a * b;
        result.setText(Float.toString(res));
        /*EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView res = (TextView)findViewById(R.id.Result);

        int m1 = Integer.parseInt(n1.getText().toString());
        int m2 = Integer.parseInt(n2.getText().toString());
        int resMultiplication = m1 * m2;
        res.setText(Integer.toString(resMultiplication));*/
    }

    public void onButtonClick4(View v) {
        EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView result = (TextView)findViewById(R.id.Result);

        float a = Float.parseFloat(n1.getText().toString());
        float b = Float.parseFloat(n2.getText().toString());
        float res = a / b;
        result.setText(Float.toString(res));
        /*EditText n1 = (EditText)findViewById(R.id.Num1);
        EditText n2 = (EditText)findViewById(R.id.Num2);
        TextView res = (TextView)findViewById(R.id.Result);

        int m1 = Integer.parseInt(n1.getText().toString());
        int m2 = Integer.parseInt(n2.getText().toString());
        int resDivision = m1 / m2;
        res.setText(Integer.toString(resDivision));*/
    }
}