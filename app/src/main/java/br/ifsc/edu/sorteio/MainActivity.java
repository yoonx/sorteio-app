package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = findViewById(R.id.editTextinicial);
        editTextfinal = findViewById(R.id.editTextfinal);
        resultado = findViewById(R.id.resultado);
    }

    public void sortear(View view) {
        Button bot = (Button) view;
        bot.setText("Sortear Novamente");

        int inicial = Integer.parseInt(editTextinicial.getText().toString());
        int fim = Integer.parseInt(editTextfinal.getText().toString());


        Random rand = new Random();
        int numSort = rand.nextInt((fim - inicial) + 1)+ inicial;

        resultado.setText(Integer.toString(numSort));

    }
}
