package com.example.user.sbsf2;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    final String TAG = this.getClass().getName();

    FloatingActionButton fab_plus,fab_office,fab_developer;
    Animation Fabopen,Fabclose,FabRclockwise,FabRanticlockwise;

    boolean isOpen = false;


    ImageButton socialbtn;
    ImageButton websitebtn;
    ImageButton sevicesbtn;
    ImageButton activitiesbtn;
    ImageButton eventsbtn;
    ImageButton gamebtn;
    ImageButton joinusbtn;
    ImageButton contactbtn;
    ImageButton spotligthtbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        socialbtn = (ImageButton) findViewById(R.id.social);
        websitebtn = (ImageButton) findViewById(R.id.website);
        sevicesbtn = (ImageButton) findViewById(R.id.services);
        activitiesbtn = (ImageButton) findViewById(R.id.activities);
        eventsbtn = (ImageButton) findViewById(R.id.events);
        gamebtn = (ImageButton) findViewById(R.id.game);
        joinusbtn = (ImageButton) findViewById(R.id.join);
        contactbtn = (ImageButton) findViewById(R.id.contact);
        spotligthtbtn = (ImageButton) findViewById(R.id.spotlight);


        fab_plus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fab_office = (FloatingActionButton) findViewById(R.id.fab_office);
        fab_developer = (FloatingActionButton) findViewById(R.id.fab_developer);

        Fabopen = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        Fabclose = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRclockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isOpen){

                    fab_office.startAnimation(Fabclose);
                    fab_developer.startAnimation(Fabclose);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_developer.setClickable(false);
                    fab_office.setClickable(false);
                    isOpen = false;

                }

                else {
                    fab_office.startAnimation(Fabopen);
                    fab_developer.startAnimation(Fabopen);
                    fab_plus.startAnimation(FabRclockwise);
                    fab_developer.setClickable(true);
                    fab_office.setClickable(true);
                    isOpen = true;
                }
            }
        });


        socialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,SocialActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        websitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,WebsiteActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        sevicesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,ActivitiesActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        activitiesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,ServicesActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        eventsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,EventsActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,GameActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        joinusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,JoinusActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        contactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        spotligthtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,SpotlightActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        fab_office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,OfficeActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });

        fab_developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLoadNewActivity = new Intent(MainActivity.this,DeveloperActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });


    }

    boolean twice;
    @Override
    public void onBackPressed(){

        Log.d(TAG, "click");

        if(twice==true){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        }
        twice = true;
        Log.d(TAG, "twice: " + twice);

        //super.onBackPressed();
        Toast.makeText(MainActivity.this, "Please press back again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                twice = false;
                Log.d(TAG, "twice: " + twice);

            }
        },3000);

    }
}



