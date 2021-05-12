package com.gordann.converter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;
import android.os.Bundle;


public class SettingsActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        /* Set views state */
        Switch switch_theme = findViewById(R.id.switch_theme);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            switch_theme.toggle();
        }

        /* Set listeners */
        switch_theme.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.switch_theme:
                if (((Switch) v).isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
                break;
            default:
                break;
        }
    }
}