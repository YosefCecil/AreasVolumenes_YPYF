package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CirculoActivity extends AppCompatActivity
{
    private EditText tfRadio;
    private TextView lblPerimetro;
    private TextView lblArea;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        tfRadio = (EditText)findViewById(R.id.tfRadio);

        lblPerimetro = (TextView)findViewById(R.id.lblPerimetro);
        lblArea = (TextView)findViewById(R.id.lblArea);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double radio = Double.parseDouble(tfRadio.getText().toString());

                double perimetro = 2 * Math.PI * radio;

                double area = Math.PI * Math.pow(radio, 2);

                lblPerimetro.setText(String.format("%.2f", perimetro));
                lblArea.setText(String.format("%.2f", area));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfRadio.setText("");
                lblPerimetro.setText("0");
                lblArea.setText("0");
            }
        });
    }
}
