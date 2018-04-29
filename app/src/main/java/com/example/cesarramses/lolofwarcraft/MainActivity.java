package com.example.cesarramses.lolofwarcraft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lblNombreP1, lblNombreP2, lblVidaP1,lblVidaP2;
    PersonajePrincipal personaje1, personaje2;
    ImageButton btnPosionP1,btnPosionP2, btnAtaqueP1, btnAtaqueP2;
    ImageView imgP1,imgP2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblNombreP1=findViewById(R.id.lblNombreP1);
        lblNombreP2=findViewById(R.id.lblNombreP2);
        lblVidaP1=findViewById(R.id.lblVidap1);
        lblVidaP2=findViewById(R.id.lblVidaP2);

        imgP1=findViewById(R.id.imgP1);
        imgP2=findViewById(R.id.imgP2);

        btnPosionP1=findViewById(R.id.btnPosionP1);
        btnPosionP2=findViewById(R.id.btnPosionP2);
        btnAtaqueP1=findViewById(R.id.btnAtaqueP1);
        btnAtaqueP2=findViewById(R.id.btnAtaqueP2);

        personaje1 =new PersonajePrincipal("Goku",1000,1,50,60,60,0);
        personaje2=new PersonajePrincipal("vegeta",1000,1,50,60,60,0);

        lblNombreP1.setText(personaje1.getNombre());
        lblVidaP1.setText(personaje1.getVida()+"");

        lblNombreP2.setText(personaje2.getNombre());
        lblVidaP2.setText(personaje2.getVida()+"");




        btnPosionP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personaje1.tomarPosion(200);
                lblVidaP1.setText(personaje1.getVida()+"");

            }
        });

        btnPosionP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personaje2.tomarPosion(200);
                lblVidaP2.setText(personaje2.getVida()+"");
            }
        });

        btnAtaqueP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgP2.animate().setDuration(2000).rotationY(360);

                personaje1.atacar(personaje2);
                lblVidaP2.setText(personaje2.getVida()+"");

            }
        });

        btnAtaqueP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgP1.animate().setDuration(2000).rotationY(360);
                personaje2.atacar(personaje1);
                lblVidaP1.setText(personaje1.getVida()+"");
            }
        });
    }
}
