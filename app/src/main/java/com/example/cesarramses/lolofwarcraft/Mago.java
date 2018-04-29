package com.example.cesarramses.lolofwarcraft;

/**
 * clase que ereda de personaje principal
 * Created by Cesar Ramses on 28/04/2018.
 */

public class Mago extends PersonajePrincipal {
    int sabiduria, ataqueMagico;

    Mago(){
        super();
        sabiduria=100;
        ataqueMagico=200;
    }

    @Override
    public void atacar(PersonajePrincipal objetivo){

        objetivo.mana=objetivo.mana-ataqueMagico;

        if (objetivo.mana<0){
            objetivo.vida += objetivo.armadura;
            objetivo.mana=0;
        }
    }//atacar

}
