package com.rich007.dicee;

import android.support.v7.app.AppCompatActivity;
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

        final Button btn = (Button) findViewById(R.id.rollButton);

        final ImageView leftImage = (ImageView) findViewById(R.id.leftDice);
        final ImageView rightImage = (ImageView) findViewById(R.id.rightDice);

        //resources id is getting stored
        final int[] images = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Log.d("name","gotcha!");

                Random randomNumber = new Random();

                int numberL = randomNumber.nextInt(6); //0-5
                int numberR = randomNumber.nextInt(6);


                leftImage.setImageResource(images[numberL]);
                rightImage.setImageResource(images[numberR]);

            }

        });





    }
}
