package com.page_envy.androidfragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Configuration configInfo = getResources().getConfiguration();

        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){

            FragmentLandscape fragmentLandscape = new FragmentLandscape();

            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);

        } else{

            FragmentPortrait fragmentPortrait = new FragmentPortrait();

            fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }

        fragmentTransaction.commit();

        //setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }


}
