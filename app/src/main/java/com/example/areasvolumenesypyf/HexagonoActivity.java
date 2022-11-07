package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class HexagonoActivity extends AppCompatActivity
{
    private EditText tfLado;
    private TextView lblPerimetro;
    private TextView lblArea;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);

        tfLado = (EditText)findViewById(R.id.tfLado);

        lblPerimetro = (TextView)findViewById(R.id.lblPerimetro);
        lblArea = (TextView)findViewById(R.id.lblArea);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double lado = Double.parseDouble(tfLado.getText().toString());

                double perimetro = lado * 6;

                double ladoB = lado * lado;
                double apotema = Math.sqrt(ladoB-(ladoB/4));

                double area = (perimetro * apotema)/2;

                lblPerimetro.setText(String.format("%.2f" ,perimetro));
                lblArea.setText(String.format("%.2f", area));

            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfLado.setText("");
                lblPerimetro.setText("0");
                lblArea.setText("0");
            }
        });
    }
}
