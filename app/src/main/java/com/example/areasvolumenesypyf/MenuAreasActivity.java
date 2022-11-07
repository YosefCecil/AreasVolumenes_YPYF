package com.example.areasvolumenesypyf;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAreasActivity extends AppCompatActivity
{
    private RecyclerView recyclerMenuAreas;
    private RecyclerMAreasAdapter adapter;
    private ArrayList<ImgAreas> arrayAreas;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuareas);

        arrayAreas = new ArrayList<ImgAreas>();

        arrayAreas.add(new ImgAreas("1", "Hexágono", R.drawable.areahexagono_r));
        arrayAreas.add(new ImgAreas("2", "Pentágono", R.drawable.areapentagono_r));
        arrayAreas.add(new ImgAreas("3", "Cuadrado", R.drawable.areacuadrado_r));
        arrayAreas.add(new ImgAreas("4", "Círculo", R.drawable.areacirculo_r));
        arrayAreas.add(new ImgAreas("5", "Triángulo", R.drawable.areatriangulo_r));

        recyclerMenuAreas = (RecyclerView)findViewById(R.id.recyclerMenuAreas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerMenuAreas.setLayoutManager(layoutManager);

        if(this.recyclerMenuAreas.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            recyclerMenuAreas.setLayoutManager(new GridLayoutManager(this, 2));
        }

        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(MenuAreasActivity.this, R.dimen.spacingGridRecyclerView);
        recyclerMenuAreas.addItemDecoration(itemDecoration);

        adapter = new RecyclerMAreasAdapter(arrayAreas);

        adapter.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                if (arrayAreas.get(recyclerMenuAreas.getChildAdapterPosition(view)).getnActivity() == "1")
                {
                    Intent apHexagono = new Intent(MenuAreasActivity.this, HexagonoActivity.class);
                    startActivity(apHexagono);
                }
                else if(arrayAreas.get(recyclerMenuAreas.getChildAdapterPosition(view)).getnActivity() == "2")
                {
                    Intent apPentagono = new Intent(MenuAreasActivity.this, PentagonoActivity.class);
                    startActivity(apPentagono);
                }
                else if(arrayAreas.get(recyclerMenuAreas.getChildAdapterPosition(view)).getnActivity() == "3")
                {
                    Intent apCuadrado = new Intent(MenuAreasActivity.this, CuadradoActivity.class);
                    startActivity(apCuadrado);
                }
                else if(arrayAreas.get(recyclerMenuAreas.getChildAdapterPosition(view)).getnActivity() == "4")
                {
                    Intent apCirculo = new Intent(MenuAreasActivity.this, CirculoActivity.class);
                    startActivity(apCirculo);
                }
                else if(arrayAreas.get(recyclerMenuAreas.getChildAdapterPosition(view)).getnActivity() == "5")
                {
                    Intent apTriangulo = new Intent(MenuAreasActivity.this, TrianguloActivity.class);
                    startActivity(apTriangulo);
                }
            }
        });

        recyclerMenuAreas.setAdapter(adapter);
    }
}
