package com.gordann.converter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.text.InputType;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.Pair;
import android.os.Bundle;

public class ConverterActivity extends AppCompatActivity implements TextWatcher {
    private List<Pair<EditText, BigDecimal>> fieldsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        /* Get extras */
        Intent intent = getIntent();
        setTitle(intent.getIntExtra("title", 0));
        final int factorArrayId = intent.getIntExtra("factorArrayId", 0);
        final int dimensionArrayId = intent.getIntExtra("dimensionArrayId", 0);

        /* Get field's values */
        String[] factorArray = getResources().getStringArray(factorArrayId);
        String[] dimensionArray = getResources().getStringArray(dimensionArrayId);

        /* Create field's list */
        final int fieldsNumber = factorArray.length;
        this.fieldsList = new ArrayList<>(fieldsNumber);

        /* Create layouts params */
        LinearLayout.LayoutParams valueParams = new LinearLayout.LayoutParams(
                500, LinearLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout.LayoutParams dimensionParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        /* Generate fields */
        LinearLayout layoutMain = (LinearLayout) findViewById(R.id.layout);
        for (int i = 0; i < fieldsNumber; ++i) {
            /* Create value filed */
            EditText editText = new EditText(this);
            editText.setInputType(InputType.TYPE_CLASS_NUMBER |
                    InputType.TYPE_NUMBER_FLAG_SIGNED |
                    InputType.TYPE_NUMBER_FLAG_DECIMAL);
            editText.setGravity(Gravity.END);
            editText.addTextChangedListener(this);

            /* Create dimension filed */
            TextView textView = new TextView(this);
            textView.setText(dimensionArray[i]);

            /* Create layout */
            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            if (i % 2 != 0) {
                layout.setBackgroundColor(getResources().getColor(R.color.gray_transparent));
            }

            /* Add to activity */
            layout.addView(editText, valueParams);
            layout.addView(textView, dimensionParams);
            layoutMain.addView(layout, dimensionParams);

            /* Add to fields list */
            this.fieldsList.add(Pair.create(editText, new BigDecimal(factorArray[i])));
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) { }

    @Override
    public void afterTextChanged(Editable s) {
        EditText current = (EditText) getCurrentFocus();

        /* Return if it isn't current */
        if (current.getText() != s) {
            return;
        }

        /* Update all and return if it's null value */
        if (s.toString().equals("")) {
            for (Pair<EditText, BigDecimal> i : this.fieldsList) {
                if (i.first != current) {
                    i.first.setText("");
                }
            }
            return;
        }

        /* Find number */
        BigDecimal number = BigDecimal.valueOf(0.0);
        for (Pair<EditText, BigDecimal> i : this.fieldsList) {
            if (i.first == current) {
                number = i.second;
                break;
            }
        }

        /* Return if can't find */
        if (number.equals(BigDecimal.valueOf(0.0))) {
            return;
        }

        /* Calculate other values */
        DecimalFormat format = new DecimalFormat("0.0E0");
        format.setMaximumFractionDigits(12);
        format.setGroupingUsed(false);
        number = new BigDecimal(s.toString()).divide(number);
        for (Pair<EditText, BigDecimal> i : this.fieldsList) {
            if (i.first != current) {
                String text = number.multiply(i.second).toString();
                if (text.length() > 17) {
                    text = format.format(number.multiply(i.second));
                }
                if (!text.equals(s.toString())) {
                    i.first.setText(text);
                }
            }
        }
    }
}