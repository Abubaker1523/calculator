package com.example.cal;

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
    public void Add(View v)
    {
        EditText e1= (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText e2= (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText e3= (EditText) findViewById(R.id.editTextNumber);
        double n1 = Integer.parseInt(e1.getText().toString());
        double  n2 = Integer.parseInt(e2.getText().toString());
        double  result = n1+n2;

        e3.setText("result :"+result);


    }
    public void Subtract(View v)
    {
        EditText e1= (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText e2= (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText e3= (EditText) findViewById(R.id.editTextNumber);
        double  n1 = Integer.parseInt(e1.getText().toString());
        double  n2 = Integer.parseInt(e2.getText().toString());
        double  result = n1-n2;

        e3.setText("result :"+result);

    }
    public void Multiply(View v)
    {
        EditText e1= (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText e2= (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText e3= (EditText) findViewById(R.id.editTextNumber);
        double  n1 = Integer.parseInt(e1.getText().toString());
        double  n2 = Integer.parseInt(e2.getText().toString());
        double  result = n1*n2;

        e3.setText("result :"+result);

    }
    public void Divide(View v)
    {
        EditText e1= (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText e2= (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText e3= (EditText) findViewById(R.id.editTextNumber);
        double  n1 = Integer.parseInt(e1.getText().toString());
        double  n2 = Integer.parseInt(e2.getText().toString());
        double  result = n1/n2;

        e3.setText("result :"+result);

    }

}