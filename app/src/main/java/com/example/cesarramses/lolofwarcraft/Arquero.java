package com.example.cesarramses.lolofwarcraft;

/**
 * subclase de personajePrncipal
 * Created by Cesar Ramses on 28/04/2018.
 */

public class Arquero extends PersonajePrincipal {
    int precision;
    int piercing;

    Arquero(){
        super();
        precision=100;
        piercing=10;

    }

    @Override
    public void atacar(PersonajePrincipal objetivo){
        objetivo.vida-=atkFisico*(piercing/100);
        objetivo.armadura=objetivo.armadura-atkFisico;

        if (objetivo.armadura<0){
            objetivo.vida += objetivo.armadura;
            objetivo.armadura=0;
        }
    }//atacar
}
