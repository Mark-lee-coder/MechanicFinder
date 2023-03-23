package com.example.mechanicfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Garages extends AppCompatActivity {
    ListView lvGaragesList;

    String[] garages = {
            "Comrade Auto Garage",
            "Hermit Garage",
            "Hussein Auto Garage",
            "Joland Garage",
            "Meads Garage",
            "Mene Auto Garage",
            "Ruaraka Auto Garage",
            "Servex Auto Garage",
            "Vincent Garage",
            "Wilter Auto Garage"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garages);

        lvGaragesList = findViewById(R.id.garagesList);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, garages);
        lvGaragesList.setAdapter(arrayAdapter);

        lvGaragesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=COMRADE AUTO GARAGE")));
                }
                if (position == 1) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Hermit Garage")));
                }
                if (position == 2) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=HUSSEIN AUTO GARAGE")));
                }
                if (position == 3) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Joland Garage")));
                }
                if (position == 4) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Meads Garage")));
                }
                if (position == 5) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Mene Auto Garage")));
                }
                if (position == 6) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Ruaraka Auto Garage")));
                }
                if (position == 7) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Servex Auto Garage")));
                }
                if (position == 8) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Vincent Garage")));
                }
                if (position == 9) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Wilter Auto Garage")));
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Garages.this, Services.class));
        finish();
    }
}