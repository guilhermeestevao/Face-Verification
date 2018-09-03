package com.example.guilhermeestevao.faceverification.gui;

import android.os.Bundle;

import com.example.guilhermeestevao.faceverification.utils.BaseActivity;


public class SettingsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}