package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button uno = (Button) findViewById(R.id.uno);
        TextView pantalla =(TextView) findViewById(R.id.pantalla);



        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla.append("1");
                CharSequence res = pantalla.getText();
            }
        });

       Button dos = (Button) findViewById(R.id.dos);

       dos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("2");
               CharSequence res = pantalla.getText();
           }
       });

       Button tres = (Button) findViewById(R.id.tres);

       tres.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("3");
               CharSequence res = pantalla.getText();
           }
       });

       Button cuatro = (Button) findViewById(R.id.cuatro);

       cuatro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("5");
               CharSequence res = pantalla.getText();
           }
       });

       Button cinco = (Button) findViewById(R.id.cinco);

       cinco.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("5");
               CharSequence res = pantalla.getText();
           }
       });

       Button seis = (Button) findViewById(R.id.seis);

       seis.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("6");
               CharSequence res = pantalla.getText();
           }
       });

       Button siete = (Button) findViewById(R.id.siete);

       siete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("7");
               CharSequence res = pantalla.getText();
           }
       });

       Button ocho = (Button) findViewById(R.id.ocho);

       ocho.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("8");
               CharSequence res = pantalla.getText();
           }
       });

       Button nueve = (Button) findViewById(R.id.nueve);

       nueve.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("8");
               CharSequence res = pantalla.getText();
           }
       });

       Button cero = (Button) findViewById(R.id.cero);

       cero.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.append("0");
               CharSequence res = pantalla.getText();
           }
       });

       Button mas = (Button) findViewById(R.id.mas);

       mas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



           }
       });

       Button menos = (Button) findViewById(R.id.menos);

       menos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText(pantalla+"-");

           }
       });

       Button raiz = (Button) findViewById(R.id.raiz);

       raiz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText("√"+pantalla);

           }
       });

       Button porcentaje = (Button) findViewById(R.id.porcentaje);

       porcentaje.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText("%"+pantalla);

           }
       });

       Button por = (Button) findViewById(R.id.por);

       por.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText(pantalla+"X");

           }
       });

       Button barra = (Button) findViewById(R.id.barra);

       barra.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText(pantalla+"/");

           }
       });

       Button AC = (Button) findViewById(R.id.AC);

       AC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText("0");

           }
       });

       Button igual = (Button) findViewById(R.id.igual);

       igual.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pantalla.setText(pantalla.getText());

           }
       });






    }
}