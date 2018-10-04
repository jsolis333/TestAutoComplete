package com.example.solis.testautocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] MONTHS = new String[] {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> aMonth = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, MONTHS);

        AutoCompleteTextView vTextView =  findViewById(R.id.Month_list);
        vTextView.setAdapter(aMonth);
        vTextView.setThreshold(1);


    }



}
