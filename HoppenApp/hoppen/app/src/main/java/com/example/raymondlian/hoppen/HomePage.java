package com.example.raymondlian.hoppen;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    public boolean LoginStatus; //True for LogIn, False for SignUp
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_activity);

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        //SignIn fragment uploaded by default
        SignInFragment StartingFragment = new SignInFragment();
        LoginStatus = true;
        fragmentTransaction.add(R.id._info_container, StartingFragment, "Current");
        fragmentTransaction.commit();


    }
    public void _SwitchToSignUp(){
        //Checks if transaction is necessary
        if(LoginStatus == true) {
            SignUpFragment ReplacementFragment = new SignUpFragment();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id._info_container, ReplacementFragment);
            LoginStatus = false;
            transaction.commit();
        }
    }
    public void _SwitchToLogIn(){
        if(LoginStatus == false) {
            SignInFragment ReplacementFragment = new SignInFragment();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id._info_container, ReplacementFragment);
            LoginStatus = true;
            transaction.commit();
        }

    }


}
