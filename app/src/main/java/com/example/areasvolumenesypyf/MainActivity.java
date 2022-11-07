package com.example.areasvolumenesypyf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardAreas;
    private CardView cardVolumenes;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardAreas = (CardView) findViewById(R.id.cardAreas);
        cardAreas.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent menuAreas = new Intent(MainActivity.this, MenuAreasActivity.class);
                startActivity(menuAreas);
            }
        });

        cardVolumenes = (CardView) findViewById(R.id.cardVolumenes);
        cardVolumenes.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent menuVolumenes = new Intent(MainActivity.this, MenuVolumenesActivity.class);
                startActivity(menuVolumenes);
            }
        });
    }
}