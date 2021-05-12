package com.gordann.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.Pair;
import android.os.Bundle;

public class ConverterActivity extends AppCompatActivity {
    private Pair<TextView, Float>[] tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        /* Get extras */
        Intent i = getIntent();
        setTitle(i.getIntExtra("title", 0));
        int factorArrayId = i.getIntExtra("factorArrayId", 0);
        int dimensionArrayId = i.getIntExtra("dimensionArrayId", 0);

        /* Generate fields */
        LinearLayout llMain = (LinearLayout) findViewById(R.id.layoutrrr);
        for (String dimension : getResources().getStringArray(dimensionArrayId)) {
            LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            TextView etName = new TextView(this);
            etName.setText(dimension);
            llMain.addView(etName, lParams);
        }
    }
}