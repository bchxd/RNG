package com.example.charl.rng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void generate(View view){
        Random rand = new Random();
        int number = rand.nextInt(10)+1;
        TextView myText = (TextView)findViewById(R.id.RNG);
        String myString = String.valueOf(number);
        myText.setText(myString);
        if (number <= 8){
            myString = "5% discount";
            myText.setText(myString);
        }
        else{
            myString = "12% discount";
            myText.setText(myString);
        }
    }
}
