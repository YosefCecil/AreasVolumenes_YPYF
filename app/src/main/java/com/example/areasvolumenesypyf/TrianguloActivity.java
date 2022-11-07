package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TrianguloActivity extends AppCompatActivity
{
    private EditText tfBase;
    private EditText tfAltura;

    private TextView lblPerimetro;
    private TextView lblArea;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        tfBase = (EditText)findViewById(R.id.tfBase);
        tfAltura = (EditText)findViewById(R.id.tfAltura);

        lblPerimetro = (TextView)findViewById(R.id.lblPerimetro);
        lblArea = (TextView)findViewById(R.id.lblArea);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double base = Double.parseDouble(tfBase.getText().toString());
                double altura = Double.parseDouble(tfAltura.getText().toString());

                double perimetro = base * 3;

                double area = base * altura / 2;

                lblPerimetro.setText(String.format("%.2f", perimetro));
                lblArea.setText(String.format("%.2f", area));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfBase.setText("");
                tfAltura.setText("");
                lblPerimetro.setText("0");
                lblArea.setText("0");
            }
        });
    }
}
