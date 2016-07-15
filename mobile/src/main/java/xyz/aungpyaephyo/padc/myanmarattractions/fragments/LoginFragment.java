package xyz.aungpyaephyo.padc.myanmarattractions.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import xyz.aungpyaephyo.padc.myanmarattractions.R;

/**
 * Created by Kaung Htet Lin on 7/14/2016.
 */
public class LoginFragment extends Fragment {

    public LoginFragment() {

    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = (Button) view.findViewById(R.id.btn_login);
        final EditText etUsername = (EditText) view.findViewById(R.id.et_username);
        final EditText etPassword = (EditText) view.findViewById(R.id.et_password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();


            Toast.makeText(getContext(), "Hello Login Form : " + username + " " + password, Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}
