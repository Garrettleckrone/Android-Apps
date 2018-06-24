package com.example.s.lab3tapcounterrevised;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textview;
    private Counter count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = new Counter();
        textview = (TextView) findViewById(R.id.textView);

        //Button Listener
        Button incButton = (Button) findViewById(R.id.button3);
        incButton.setOnClickListener(incButtonListener);
        Button decButton = (Button) findViewById(R.id.button);
        decButton.setOnClickListener(decButtonListener);
        Button resetButton = (Button) findViewById(R.id.button2);
        resetButton.setOnClickListener(resetButtonListener);

    }

    private final View.OnClickListener incButtonListener = new View.OnClickListener(){
        public void onClick (View btn3){
            count.incCount();
            textview.setText(count.getCount().toString());
        }

    };
    private final View.OnClickListener decButtonListener = new View.OnClickListener(){
        public void onClick (View btn3){
            count.decCount();
            textview.setText(count.getCount().toString());
        }

    };
    private final View.OnClickListener resetButtonListener = new View.OnClickListener(){
        public void onClick (View btn3){
            count.resetCount();
            textview.setText(count.getCount().toString());
        }

    };


    public void incTap(View view){
        count.incCount();
        textview.setText(count.getCount().toString());
    }
    public void decTap(View view){
        count.decCount();
        textview.setText(count.getCount().toString());
    }
    public void resetTap(View view){
        count.resetCount();
        textview.setText(count.getCount().toString());
    }

}
