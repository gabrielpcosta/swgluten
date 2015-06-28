package com.app.swgluten.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.app.swgluten.R;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class LoginActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }


    public void signWithFacebook(View view) {
        //Add code to login with facebook
    }

    public void signAsGuest(View view) {
        //Add code to login as guest
    }

    public void signWithEmail(View view) {
        //Add code to login with email
    }

    public void signUp(View view) {
        //Add code to sign up
    }
}
