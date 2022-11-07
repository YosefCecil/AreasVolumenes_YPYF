package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PTriangularActivity extends AppCompatActivity
{
    private EditText tfBase;
    private EditText tfTAltura;
    private EditText tfPAltura;

    private TextView lblVolumen;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptriangular);

        tfBase = (EditText)findViewById(R.id.tfBase);
        tfTAltura = (EditText)findViewById(R.id.tfTAltura);
        tfPAltura = (EditText)findViewById(R.id.tfPAltura);

        lblVolumen = (TextView)findViewById(R.id.lblVolumen);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double base = Double.parseDouble(tfBase.getText().toString());
                double alturaTriangulo = Double.parseDouble(tfTAltura.getText().toString());
                double alturaPrisma = Double.parseDouble(tfPAltura.getText().toString());


                double area = base * alturaTriangulo / 2;

                double volumen = area * alturaPrisma;

                lblVolumen.setText(String.format("%.2f", volumen));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfBase.setText("");
                tfTAltura.setText("");
                tfPAltura.setText("");
                lblVolumen.setText("0");
            }
        });
    }
}
