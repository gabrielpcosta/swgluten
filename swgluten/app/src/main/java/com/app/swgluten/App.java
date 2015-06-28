package com.app.swgluten;

import android.app.Application;

import com.app.swgluten.utils.ParseGlobals;
import com.parse.Parse;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, ParseGlobals.APPLICATION_ID, ParseGlobals.ANDROID_KEY);
    }
}
