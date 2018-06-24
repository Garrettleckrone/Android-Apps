package com.example.s.testbutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Counter count;
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(res.layout.activitymain);

        count = new Counter(

        );
        countView = (TextView) findViewById(R.id.textView3);
    }

    public void countTap(View view){
        count.addTap();
        countView.setText(count.getCount());
    }
}
