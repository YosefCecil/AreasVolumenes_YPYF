package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PPentagonalActivity extends AppCompatActivity
{
    private EditText tfLado;
    private EditText tfAltura;

    private TextView lblVolumen;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppentagonal);

        tfLado = (EditText)findViewById(R.id.tfLado);
        tfAltura = (EditText)findViewById(R.id.tfAltura);

        lblVolumen = (TextView)findViewById(R.id.lblVolumen);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double lado = Double.parseDouble(tfLado.getText().toString());
                double altura = Double.parseDouble(tfAltura.getText().toString());

                double perimetro = lado * 5;

                double apotema = (perimetro / 2) / Math.tan(36 * (Math.PI/180));

                double area = perimetro * apotema / 2;

                double volumen = area * altura;

                lblVolumen.setText(String.format("%.2f", volumen));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfLado.setText("");
                tfAltura.setText("");
                lblVolumen.setText("0");
            }
        });
    }
}
