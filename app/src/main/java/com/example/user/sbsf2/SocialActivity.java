package com.example.user.sbsf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SocialActivity extends AppCompatActivity {

    ImageButton facebookgroupbtn;
    ImageButton facebookpage1btn;
    ImageButton facebookpage2btn;
    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        facebookgroupbtn = (ImageButton) findViewById(R.id.facebookgroup);
        facebookpage1btn = (ImageButton) findViewById(R.id.facebookpage1);
        facebookpage2btn = (ImageButton) findViewById(R.id.facebookpage2);
        home = (ImageButton) findViewById(R.id.home);


        facebookgroupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(SocialActivity.this,FacebookgroupActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        facebookpage1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(SocialActivity.this,Facebookpage1Activity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        facebookpage2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(SocialActivity.this,Facebookpage2Activity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(SocialActivity.this,MainActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

    }
}
