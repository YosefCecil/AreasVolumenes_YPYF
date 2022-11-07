package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CuboActivity extends AppCompatActivity
{
    private EditText tfLado;

    private TextView lblVolumen;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        tfLado= (EditText)findViewById(R.id.tfLado);

        lblVolumen = (TextView)findViewById(R.id.lblVolumen);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double lado = Double.parseDouble(tfLado.getText().toString());

                double volumen = Math.pow(lado, 3);

                lblVolumen.setText(String.format("%.2f", volumen));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfLado.setText("");
                lblVolumen.setText("0");
            }
        });
    }
}
