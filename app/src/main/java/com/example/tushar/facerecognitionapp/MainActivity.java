package com.example.tushar.facerecognitionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void createM () {
        Intent createIntent = new Intent(this, BioActivity.class);
        startActivity(createIntent);
    }

    public void detectM () {
        Intent chemIntent = new Intent(this, ChemActivity.class);
        startActivity(chemIntent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button detect = (Button) findViewById(R.id.detect);
        Button create = (Button) findViewById(R.id.create);
        detect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detectM();
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createM();
            }
        });
        setContentView(R.layout.activity_main);
    }
}
