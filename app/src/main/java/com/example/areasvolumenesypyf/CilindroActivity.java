package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CilindroActivity extends AppCompatActivity
{
    private EditText tfRadio;
    private EditText tfAltura;

    private TextView lblVolumen;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        tfRadio = (EditText)findViewById(R.id.tfRadio);
        tfAltura = (EditText)findViewById(R.id.tfAltura);

        lblVolumen = (TextView)findViewById(R.id.lblVolumen);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double radio = Double.parseDouble(tfRadio.getText().toString());
                double altura = Double.parseDouble(tfAltura.getText().toString());

                double area = Math.PI * Math.pow(radio, 2);

                double volumen = area * altura;

                lblVolumen.setText(String.format("%.2f", volumen));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfRadio.setText("");
                tfAltura.setText("");
                lblVolumen.setText("0");
            }
        });
    }
}
