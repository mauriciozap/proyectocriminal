package com.example.mauri.crimeltnent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


/**
 * Created by mauri on 30/11/2017.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mCrime=new Crime();
        View v = inflater.inflate(R.layout.fragmento_crime, container , false);

        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mDateButton = (Button) v.findViewById(R.id.crime_date);
        mSolvedCheckBox = (CheckBox) v.findViewById(R.id.crime_solved);

        mDateButton.setText(mCrime.getmDate().toString());
        mDateButton.setEnabled(false);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int star, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s,int star, int before,int count) {
                mCrime.setmTitle(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

                mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    }
                });

            }
        });
        return v;

    }

}
