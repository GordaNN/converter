package com.gordann.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.app_chapter);

        /* Set listeners *//*
        findViewById(R.id.button_section_currency).setOnClickListener(this);
        findViewById(R.id.button_section_clothing_shoe).setOnClickListener(this);
        findViewById(R.id.button_section_cooking).setOnClickListener(this);
        findViewById(R.id.button_section_fuel_consumption).setOnClickListener(this);
        findViewById(R.id.button_section_time).setOnClickListener(this);
        findViewById(R.id.button_section_angle).setOnClickListener(this);
        findViewById(R.id.button_section_numbers).setOnClickListener(this);
        findViewById(R.id.button_section_units_fractions).setOnClickListener(this);
        findViewById(R.id.button_section_si_prefixes).setOnClickListener(this);
        findViewById(R.id.button_section_astronomy_distance).setOnClickListener(this);*/
        findViewById(R.id.button_section_length).setOnClickListener(this);/*
        findViewById(R.id.button_section_area).setOnClickListener(this);
        findViewById(R.id.button_section_volume).setOnClickListener(this);
        findViewById(R.id.button_section_speed).setOnClickListener(this);
        findViewById(R.id.button_section_acceleration).setOnClickListener(this);
        findViewById(R.id.button_section_angular_speed).setOnClickListener(this);
        findViewById(R.id.button_section_flow_rate).setOnClickListener(this);
        findViewById(R.id.button_section_data_storage).setOnClickListener(this);
        findViewById(R.id.button_section_data_transfer).setOnClickListener(this);
        findViewById(R.id.button_section_pressure).setOnClickListener(this);
        findViewById(R.id.button_section_weight).setOnClickListener(this);
        findViewById(R.id.button_section_force).setOnClickListener(this);
        findViewById(R.id.button_section_torque).setOnClickListener(this);
        findViewById(R.id.button_section_density).setOnClickListener(this);
        findViewById(R.id.button_section_dynamic_viscosity).setOnClickListener(this);
        findViewById(R.id.button_section_kinematic_viscosity).setOnClickListener(this);
        findViewById(R.id.button_section_mineralization).setOnClickListener(this);
        findViewById(R.id.button_section_energy).setOnClickListener(this);
        findViewById(R.id.button_section_power).setOnClickListener(this);
        findViewById(R.id.button_section_temperature).setOnClickListener(this);
        findViewById(R.id.button_section_electric_charge).setOnClickListener(this);
        findViewById(R.id.button_section_electric_current).setOnClickListener(this);
        findViewById(R.id.button_section_electrical_resistance).setOnClickListener(this);
        findViewById(R.id.button_section_electric_potential).setOnClickListener(this);
        findViewById(R.id.button_section_electric_capacitance).setOnClickListener(this);
        findViewById(R.id.button_section_luminance).setOnClickListener(this);
        findViewById(R.id.button_section_illuminance).setOnClickListener(this);
        findViewById(R.id.button_section_radiation).setOnClickListener(this);
        findViewById(R.id.button_section_radioactivity).setOnClickListener(this);
        findViewById(R.id.button_section_magnetic_field).setOnClickListener(this);
        findViewById(R.id.button_section_typography).setOnClickListener(this);
        findViewById(R.id.button_section_sound).setOnClickListener(this);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        int title = 0;
        int factorArrayId = 0;
        int dimensionArrayId = 0;
        switch (v.getId()) {
            case R.id.button_section_currency:
                break;
            case R.id.button_section_clothing_shoe:
                break;
            case R.id.button_section_cooking:
                break;
            case R.id.button_section_fuel_consumption:
                break;
            case R.id.button_section_time:
                break;
            case R.id.button_section_angle:
                break;
            case R.id.button_section_numbers:
                break;
            case R.id.button_section_units_fractions:
                break;
            case R.id.button_section_si_prefixes:
                break;
            case R.id.button_section_astronomy_distance:
                break;
            case R.id.button_section_length:
                title = R.string.app_section_length;
                factorArrayId = R.array.factor_length_array;
                dimensionArrayId = R.array.dimension_length_array;
                break;
            case R.id.button_section_area:
                break;
            case R.id.button_section_volume:
                break;
            case R.id.button_section_speed:
                break;
            case R.id.button_section_acceleration:
                break;
            case R.id.button_section_angular_speed:
                break;
            case R.id.button_section_flow_rate:
                break;
            case R.id.button_section_data_storage:
                break;
            case R.id.button_section_data_transfer:
                break;
            case R.id.button_section_pressure:
                break;
            case R.id.button_section_weight:
                break;
            case R.id.button_section_force:
                break;
            case R.id.button_section_torque:
                break;
            case R.id.button_section_density:
                break;
            case R.id.button_section_dynamic_viscosity:
                break;
            case R.id.button_section_kinematic_viscosity:
                break;
            case R.id.button_section_mineralization:
                break;
            case R.id.button_section_energy:
                break;
            case R.id.button_section_power:
                break;
            case R.id.button_section_temperature:
                break;
            case R.id.button_section_electric_charge:
                break;
            case R.id.button_section_electric_current:
                break;
            case R.id.button_section_electrical_resistance:
                break;
            case R.id.button_section_electric_potential:
                break;
            case R.id.button_section_electric_capacitance:
                break;
            case R.id.button_section_luminance:
                break;
            case R.id.button_section_illuminance:
                break;
            case R.id.button_section_radiation:
                break;
            case R.id.button_section_radioactivity:
                break;
            case R.id.button_section_magnetic_field:
                break;
            case R.id.button_section_typography:
                break;
            case R.id.button_section_sound:
                break;
            default:
                return;
        }
        Intent converterActivity = new Intent(this, ConverterActivity.class);
        converterActivity.putExtra("title", title);
        converterActivity.putExtra("factorArrayId", factorArrayId);
        converterActivity.putExtra("dimensionArrayId", dimensionArrayId);
        startActivity(converterActivity);
    }
}
