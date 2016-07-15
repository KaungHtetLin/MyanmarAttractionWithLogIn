package xyz.aungpyaephyo.padc.myanmarattractions.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import xyz.aungpyaephyo.padc.myanmarattractions.R;

/**
 * Created by Kaung Htet Lin on 7/14/2016.
 */
public class RegisterFragment extends Fragment {
    public RegisterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //       return super.onCreateView(inflater, container, savedInstanceState);

        final View view = inflater.inflate(R.layout.fragment_register, container, false);

        Button btnRegister = (Button) view.findViewById(R.id.btn_fragment_register);
        final EditText etUsername = (EditText) view.findViewById(R.id.et_register_username);
        final EditText etPassword = (EditText) view.findViewById(R.id.et_register_password);
        final EditText etEmail = (EditText) view.findViewById(R.id.et_email);
        final EditText etDateOfBirth = (EditText) view.findViewById(R.id.et_dateofbityh);
        final EditText etCountry = (EditText) view.findViewById(R.id.et_country);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String email = etEmail.getText().toString();
                String dateofbirth = etDateOfBirth.getText().toString();
                String country = etCountry.getText().toString();

            }
        });

        return view;

    }
}
