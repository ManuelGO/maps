package com.marvelo.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMap(View view) {
        double lat, lon;
        Intent intent = new Intent(this, MapsActivity.class);
        switch (view.getId()) {
            case (R.id.bensPark):
                lat = 43.3644226;
                lon = -8.4373946;
                break;
            case (R.id.herculesTower):
                lat = 43.385833333333;
                lon = -8.4063888888889;
                break;
            case (R.id.vionio):
                lat = 43.354754;
                lon = -8.416431;
                break;
            case (R.id.riazor):
                lat = 43.3687184;
                lon = -8.4174835;
                break;
            default:
                lat = 43;
                lon = -8;
                break;
        }
        intent.putExtra("lat", lat);
        intent.putExtra("lon", lon);
        startActivity(intent);
    }

}