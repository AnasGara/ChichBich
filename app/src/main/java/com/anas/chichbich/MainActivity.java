package com.anas.chichbich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton=findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.imageDiceGauche);
        final ImageView rightDice = findViewById(R.id.imageDiceDroit);

        final int[] diceArray= {  R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("dicee","ze button has been clicked");
                Random randomNumberGenerator = new Random();
                int number=randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is "+number);
                leftDice.setImageResource(diceArray[number]);

                Random randomNumberGenerator2 = new Random();
                int number2=randomNumberGenerator2.nextInt(6);
                rightDice.setImageResource(diceArray[number2]);


            }
        });



    }
}