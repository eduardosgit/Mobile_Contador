package br.com.contador.eduardo.contador;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    private int cont;
    private TextView visorContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio();
    }

    public void inicio() {
        cont = 0;
        visorContador = findViewById(R.id.contador);
        visorContador.setText(String.valueOf(cont));

        final Button botaoMais = findViewById(R.id.btMais);
        final Button botaoMenos = findViewById(R.id.btMenos);
        final Button botaoZera = findViewById(R.id.btZera);
        botaoMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somar();
            }
        });

        botaoMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtrair();
            }
        });

        botaoZera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zerar();
            }
        });
    }

    public void somar() {
        cont++;
        visorContador.setText(String.valueOf(cont));
        visorContador.setBackgroundColor(Color.BLUE);
    }

    public void subtrair(){
        cont--;
        visorContador.setText(String.valueOf(cont));
        visorContador.setBackgroundColor(Color.RED);
    }

    public void zerar() {
        cont = 0;
        visorContador.setText(String.valueOf(cont));
        visorContador.setBackgroundColor(Color.GREEN);
    }
}
