package com.example.cesarramses.lolofwarcraft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lblNombreP1, lblNombreP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblNombreP1=findViewById(R.id.lblNombreP1);
        lblNombreP2=findViewById(R.id.lblNombreP2);

        PersonajePrincipal personaje1 =new PersonajePrincipal();

        Log.i("personaje1","nombre: "+personaje1.nombre);
        Log.i("personaje1","Vida: "+personaje1.vida+"");

        personaje1.vida=personaje1.vida+100;
        Log.i("personaje1","Vida: "+personaje1.vida+"");


        personaje1.tomarPosion();
        Log.i("personaje1","Vida: "+personaje1.vida+"");

        personaje1.tomarPosion(500);
        Log.i("personaje1","Vida: "+personaje1.vida+"");

        PersonajePrincipal personaje2=new PersonajePrincipal("vegeta",1000,1,50,60,60,0);
        Log.i("personaje2","Nombre: "+personaje2.nombre);
        Log.i("personaje2","Vida: "+personaje2.vida+"");

        Log.i("personaje2","Armadura: "+personaje2.armadura+"");
        personaje1.atacar(personaje2);
        Log.i("personaje2","Armadura: "+personaje2.armadura+"");
        Log.i("personaje2","Vida: "+personaje2.vida+"");
    }
}
