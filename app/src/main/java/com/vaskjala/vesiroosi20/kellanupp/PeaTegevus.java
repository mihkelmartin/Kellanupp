package com.vaskjala.vesiroosi20.kellanupp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Calendar;


public class PeaTegevus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Calendar kalender = Calendar.getInstance();
        Intent rakendus;
        if(kalender.get(Calendar.HOUR_OF_DAY) > 21 || kalender.get(Calendar.HOUR_OF_DAY) < 7)
            rakendus = getPackageManager().getLaunchIntentForPackage("com.google.android.clockwork.flashlight");
        else
            rakendus = getPackageManager().getLaunchIntentForPackage("fi.polar.polarflow");

        if (rakendus!= null) {
            startActivity(rakendus);
        }
        finish();
    }
}
