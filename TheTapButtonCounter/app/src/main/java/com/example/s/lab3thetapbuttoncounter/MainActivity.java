package com.example.s.lab3thetapbuttoncounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //MODEL
    private Counter theCount;
    //VIEW
    private TextView countView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        //Create the Counter
        theCount = new Counter();

        countView = (TextView) findViewById(R.id.textView);

    };

    //Methods added for the tap buttons to increment, decrement, and reset
    public void addTap(View view){
        theCount.addCount();
        countView.setText(theCount.getCount());
    }
    public void decTap(View view){
        theCount.decCount();
        countView.setText(theCount.getCount());
    }
    public void resetCount(View view){
        theCount.resetCount();
        countView.setText(theCount.getCount());
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
