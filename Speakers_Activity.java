package com.discovery.hisso.discovery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class Speakers_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers_);

        TextView txtView = findViewById(R.id.person_name);
        txtView.setText(R.string.john_doe);
    }


}
