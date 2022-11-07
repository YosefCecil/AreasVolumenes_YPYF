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

public class MenuVolumenesActivity extends AppCompatActivity
{
    private RecyclerView recyclerMenuVolumenes;
    private RecyclerMVolumenesAdapter adapter;
    private ArrayList<ImgVolumenes> arrayVolumenes;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuvolumenes);

        arrayVolumenes = new ArrayList<ImgVolumenes>();

        arrayVolumenes.add(new ImgVolumenes("1", "Prisma Hexagonal", R.drawable.volumenprismahexagonal_r));
        arrayVolumenes.add(new ImgVolumenes("2", "Prisma Pentagonal", R.drawable.volumenprismapentagonal_r));
        arrayVolumenes.add(new ImgVolumenes("3", "Cubo", R.drawable.volumencubo_r));
        arrayVolumenes.add(new ImgVolumenes("4", "Cilindro", R.drawable.volumencilindro_r));
        arrayVolumenes.add(new ImgVolumenes("5", "Prisma Triangular", R.drawable.volumenptriangular));

        recyclerMenuVolumenes = (RecyclerView)findViewById(R.id.recyclerMenuVolumenes);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerMenuVolumenes.setLayoutManager(layoutManager);

        if(this.recyclerMenuVolumenes.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            recyclerMenuVolumenes.setLayoutManager(new GridLayoutManager(this, 2));
        }

        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(MenuVolumenesActivity.this, R.dimen.spacingGridRecyclerView);
        recyclerMenuVolumenes.addItemDecoration(itemDecoration);

        adapter = new RecyclerMVolumenesAdapter(arrayVolumenes);
        adapter.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                if (arrayVolumenes.get(recyclerMenuVolumenes.getChildAdapterPosition(view)).getnActivity() == "1")
                {
                    Intent apPHexagonal = new Intent(MenuVolumenesActivity.this, PHexagonalActivity.class);
                    startActivity(apPHexagonal);
                }
                else if (arrayVolumenes.get(recyclerMenuVolumenes.getChildAdapterPosition(view)).getnActivity() == "2")
                {
                    Intent apPPentagonal = new Intent(MenuVolumenesActivity.this, PPentagonalActivity.class);
                    startActivity(apPPentagonal);
                }
                else if (arrayVolumenes.get(recyclerMenuVolumenes.getChildAdapterPosition(view)).getnActivity() == "3")
                {
                    Intent apPCubo = new Intent(MenuVolumenesActivity.this, CuboActivity.class);
                    startActivity(apPCubo);
                }
                else if (arrayVolumenes.get(recyclerMenuVolumenes.getChildAdapterPosition(view)).getnActivity() == "4")
                {
                    Intent apPCilindro = new Intent(MenuVolumenesActivity.this, CilindroActivity.class);
                    startActivity(apPCilindro);
                }
                else if (arrayVolumenes.get(recyclerMenuVolumenes.getChildAdapterPosition(view)).getnActivity() == "5")
                {
                    Intent apPTriangular = new Intent(MenuVolumenesActivity.this, PTriangularActivity.class);
                    startActivity(apPTriangular);
                }
            }
        });
        recyclerMenuVolumenes.setAdapter(adapter);
    }
}
