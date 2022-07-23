package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private ImageView imageResultado;
    private Button buttonVoltar;
    private TextView TextResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        TextResultado = findViewById(R.id.TextResultado);
        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero ==0 ){//cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
            TextResultado.setText("Cara");
        }else{//coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
            TextResultado.setText("Coroa");
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });
    }
}