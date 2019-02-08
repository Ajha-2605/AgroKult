package com.example.anubh.agrokult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class SelectLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);

        Spinner sp =(Spinner) findViewById(R.id.spinner);
        TextView tvC = (TextView) findViewById(R.id.tvContanctus);
        TextView tvS = (TextView) findViewById(R.id.tvSupport);
        TextView tvT = (TextView) findViewById(R.id.tvText);

    }
}
