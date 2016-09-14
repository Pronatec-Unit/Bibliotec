package org.terradigital.notasunit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText frmNota01;
    private EditText frmNota02;
    private Button btnCalcular;
    private TextView txtResultado;
    private double nota01;
    private double nota02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frmNota01 = (EditText) findViewById(R.id.frmNota01);
        frmNota02 = (EditText) findViewById(R.id.frmNota02);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nota01 = Double.parseDouble(frmNota01.getText().toString());
                nota02 = Double.parseDouble(frmNota02.getText().toString());

                Double media = calcularMedia(nota01, nota02);
                txtResultado.setText(media.toString());
            }
        });
    }

    private double calcularMedia(double n1, double n2) {
        double mediaFinal = (n1 + n2)/ 2;
        return mediaFinal;
    }
}

