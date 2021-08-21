package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;



public class MainActivity extends AppCompatActivity {

    Stack<Integer> pilha = new Stack<Integer>();
    Integer valorA;
    Integer valorB;
    Button empilhar;
    Button desempilhar;
    Button adicao;
    Button subtracao;
    Button multiplicacao;
    Button divisao;
    EditText inserir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empilhar = (Button) findViewById(R.id.empilhar);
        desempilhar = (Button) findViewById(R.id.desempilhar);
        adicao = (Button) findViewById(R.id.adicao);
        subtracao = (Button) findViewById(R.id.subtracao);
        multiplicacao = (Button) findViewById(R.id.multiplicacao);
        divisao =(Button) findViewById(R.id.divisao);
        inserir = (EditText) findViewById(R.id.inserir);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    public void mostrar(){
        resultado.setText(pilha.toString());
    }

    public void insercao(View h){
        Integer valor = Integer.parseInt(String.valueOf(inserir.getText()));
        pilha.push(valor);
        mostrar();
    }

    public void apagar(View a){
        try {
            pilha.pop();
            mostrar();
        }
        catch (Exception e) {
            resultado.setText("acabou a pilha");
        }
    }


    public void somar(View v) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA + valorB);
            mostrar();
        }
        catch (Exception e) {
            resultado.setText("não tem elementos o suficiente na pilha\n"+ pilha.toString());
        }

    }

    public void subtrair(View view) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA - valorB);
            mostrar();
        }
        catch (Exception e) {
            resultado.setText("algo de errado não está certo parça");
        }
    }

    public void multiplicar(View view) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA * valorB);
            mostrar();
        }
        catch (Exception e) {
            resultado.setText("acabou a pilha");
        }
    }

    public void divisao(View view) {
        try {
            valorA = pilha.lastElement();
            pilha.pop();
            valorB = pilha.lastElement();
            pilha.pop();
            pilha.push(valorA / valorB);
            mostrar();
        }
        catch (Exception e) {
            resultado.setText("acabou a pilha");
        }
    }
}