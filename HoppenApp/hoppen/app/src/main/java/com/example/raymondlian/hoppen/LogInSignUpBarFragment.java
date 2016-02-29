package com.example.raymondlian.hoppen;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.raymondlian.hoppen.R.color.set1Bright;

/**
 * A placeholder fragment containing a simple view.
 */
public class LogInSignUpBarFragment extends Fragment {

    public LogInSignUpBarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //name of UI objects and Global variables begin with capital letters
        View Main = (View) inflater.inflate(R.layout.fragment_login_singup_bar, container, false);
        Button SignUp = (Button) Main.findViewById(R.id._signup_button);
        Button LogIn = (Button) Main.findViewById(R.id._login_button);
        final ImageView SelectionBarLogIn = (ImageView) Main.findViewById(R.id._selection_bar_login);
        final ImageView SelectionBarSignUp = (ImageView) Main.findViewById(R.id._selection_bar_signup);


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomePage)getActivity())._SwitchToSignUp();
                SelectionBarSignUp.setBackgroundColor(Color.parseColor("#FF6D00"));
                SelectionBarLogIn.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomePage)getActivity())._SwitchToLogIn();
                SelectionBarLogIn.setBackgroundColor(Color.parseColor("#FF6D00"));
                SelectionBarSignUp.setBackgroundColor(Color.TRANSPARENT);
            }
        });


        return Main;
    }
}
