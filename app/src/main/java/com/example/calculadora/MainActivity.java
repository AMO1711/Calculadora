package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /*
     Numeros de operaciones
        0: nada
        1: dividir
        2: multiplicar
        3: restar
        4: sumar
     */
    private int num_operacion = 0;
    private double buffer = 0, memoria = 0, num_anterior = 0;
    private TextView visualizador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        visualizador = findViewById(R.id.visualizador);
    }

    public void dividir(View view){
        if (num_operacion != 0){
            resultado(view);
            visualizador.setText(String.valueOf(buffer));
        } else {
            visualizador.setText("0");
        }

        num_anterior = buffer;
        buffer = 0;
        num_operacion = 1;
    }

    public void multiplicar(View view){
        if (num_operacion != 0){
            resultado(view);
            visualizador.setText(String.valueOf(buffer));
        } else {
            visualizador.setText("0");
        }

        num_anterior = buffer;
        buffer = 0;
        num_operacion = 2;
    }

    public void restar(View view){
        if (num_operacion != 0){
            resultado(view);
            visualizador.setText(String.valueOf(buffer));
        } else {
            visualizador.setText("0");
        }

        num_anterior = buffer;
        buffer = 0;
        num_operacion = 3;
    }

    public void sumar(View view){
        if (num_operacion != 0){
            resultado(view);
            visualizador.setText(String.valueOf(buffer));
        } else {
            visualizador.setText("0");
        }

        num_anterior = buffer;
        buffer = 0;
        num_operacion = 4;
    }

    public void resultado(View view){
        switch (num_operacion){
            case 1:
                if (buffer != 0){
                    buffer = num_anterior/buffer;
                }
                break;
            case 2:
                buffer = num_anterior*buffer;
                break;
            case 3:
                buffer = num_anterior-buffer;
                break;
            case 4:
                buffer = num_anterior+buffer;
                break;
            default: break;
        }
        num_operacion = 0;
        num_anterior = 0;

        visualizador.setText(String.valueOf(buffer));
    }

    public void limpiar(View view){
        num_anterior = 0;
        num_operacion = 0;
        buffer = 0;

        visualizador.setText("0");
    }

    public void borrar_memoria(View view){
        memoria = 0;
    }

    public void recuperar_memoria(View view){
        buffer = memoria;

        visualizador.setText(String.valueOf(buffer));
    }

    public void sumar_memoria(View view){
        memoria += buffer;
    }

    public void restar_memoria(View view){
        memoria -= buffer;
    }

    public void guardar_memoria(View view){
        memoria = buffer;
    }

    public void cero(View view){
        buffer = buffer*10;

        visualizador.setText(String.valueOf(buffer));
    }

    public void doble_cero(View view){
        buffer = buffer*100;

        visualizador.setText(String.valueOf(buffer));
    }

    public void uno(View view){
        buffer = buffer*10 + 1;

        visualizador.setText(String.valueOf(buffer));
    }

    public void dos(View view){
        buffer = buffer*10 + 2;

        visualizador.setText(String.valueOf(buffer));
    }

    public void tres(View view){
        buffer = buffer*10 + 3;

        visualizador.setText(String.valueOf(buffer));
    }

    public void cuatro(View view){
        buffer = buffer*10 + 4;

        visualizador.setText(String.valueOf(buffer));
    }

    public void cinco(View view){
        buffer = buffer*10 + 5;

        visualizador.setText(String.valueOf(buffer));
    }

    public void seis(View view){
        buffer = buffer*10 + 6;

        visualizador.setText(String.valueOf(buffer));
    }

    public void siete(View view){
        buffer = buffer*10 + 7;

        visualizador.setText(String.valueOf(buffer));
    }

    public void ocho(View view){
        buffer = buffer*10 + 8;

        visualizador.setText(String.valueOf(buffer));
    }

    public void nueve(View view){
        buffer = buffer*10 + 9;

        visualizador.setText(String.valueOf(buffer));
    }
}