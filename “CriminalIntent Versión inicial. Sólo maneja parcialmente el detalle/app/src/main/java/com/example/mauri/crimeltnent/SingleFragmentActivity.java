package com.example.mauri.crimeltnent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by mauri on 30/11/2017.
 */

public abstract class SingleFragmentActivity extends FragmentActivity{
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_conteiner);
        if (fragment==null){
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_conteiner,fragment)
                    .commit();
        }

    }protected abstract Fragment createFragment();
}
