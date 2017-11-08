package com.example.user.sbsf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ServicesActivity extends AppCompatActivity {

    ImageButton sbepbtn;
    ImageButton sbcbtn;
    ImageButton isbepbtn;
    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        sbepbtn = (ImageButton) findViewById(R.id.sbep);
        sbcbtn = (ImageButton) findViewById(R.id.sbc);
        isbepbtn = (ImageButton) findViewById(R.id.ispep);
        home = (ImageButton) findViewById(R.id.home);

        sbepbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(ServicesActivity.this,SbepActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        sbcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(ServicesActivity.this,SbcActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        isbepbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(ServicesActivity.this,IsbepActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(ServicesActivity.this,MainActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

    }
}
