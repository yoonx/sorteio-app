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
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = findViewById(R.id.editTextinicial);
        editTextfinal = findViewById(R.id.editTextfinal);
        resultado = findViewById(R.id.resultado);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     sortear();

                                 }
                             }
        );


    }

    public void sortear() {

        int inicial = Integer.parseInt(editTextfinal.getText().toString());
        int fim = Integer.parseInt(editTextinicial.getText().toString());


        Random rand = new Random();
        int numSort = rand.nextInt(fim - inicial)+ inicial;

        resultado.setText(Integer.toString(numSort));

    }
}
