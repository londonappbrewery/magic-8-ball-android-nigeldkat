package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAsk = findViewById(R.id.button_Ask);
        final ImageView iv = findViewById(R.id.imageView_EightBall);

        final int[] answers = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4,
        R.drawable.ball5};

        btnAsk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int num = randomNumberGenerator.nextInt(4);
                //Log.d("dice", "num = " + num);
                //leftDice.setImageResource(diceArray[num]);
                iv.setImageResource(answers[num]);
            }
        });





    }
}
