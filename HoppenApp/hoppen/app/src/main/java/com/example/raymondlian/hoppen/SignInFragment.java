
package com.example.raymondlian.hoppen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SignInFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SignInFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignInFragment extends Fragment {
    boolean Valid;
    public SignInFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View Main = (View) inflater.inflate(R.layout.fragment_sign_in, container, false);

        Button LoginInButton = (Button) Main.findViewById(R.id._login_button);
        TextView UserName = (TextView) Main.findViewById(R.id._editText_UserEmail_SignIn);
        TextView UserPassword = (TextView) Main.findViewById(R.id._editText_UserPassword_SignIn);

        LoginInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Valid == true) {
                    Intent intent = new Intent(getActivity(), EventActivity.class);
                    startActivity(intent);
                }else{
                    Context context = getActivity().getBaseContext();
                    CharSequence text = "Incorrect Username or Password";

                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });

        return Main;
    }
}

