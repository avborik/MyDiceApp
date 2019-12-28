package com.avborik28.mydiceapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public static final String tag = "dice";
    public static final String msg = "the button is clicked";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView diceImage1 = findViewById(R.id.imgDice1);
        final ImageView diceImage2 = findViewById(R.id.imgDice2);

        final int [] diceImages = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
        R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        //diceImages[2]

        Button btnRoll = findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i(tag,msg);

                Random rndObject = new Random();

                int myRandomNumber = rndObject.nextInt(6);

                Log.i("MyDiceApp", "my generated number is " + myRandomNumber + "");

                //diceImage1.setImageResource(R.drawable.dice2);
                diceImage1.setImageResource(diceImages[myRandomNumber]);

                myRandomNumber = rndObject.nextInt(6);

                diceImage2.setImageResource(diceImages[myRandomNumber]);
            }
        });
    }
}
