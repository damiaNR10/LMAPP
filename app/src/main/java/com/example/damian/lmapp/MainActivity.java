package com.example.damian.lmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bGroupTable = (Button) findViewById(R.id.bGroupTable);

        bGroupTable.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                setContentView(R.layout.activity_group_table);

            }
        }

        );


    }
}
