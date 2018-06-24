package com.example.s.shades;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class InformationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
    setContentView(R.layout.information_fragment);

    getActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String shadeInformation = intent.getStringExtra("Information");

        TextView information = (TextView) findViewById(R.id.textView1);
        information.setText(shadeInformation);


    }
}