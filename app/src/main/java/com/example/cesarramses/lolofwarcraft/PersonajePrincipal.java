package com.example.cesarramses.lolofwarcraft;

/**
 * Created by Cesar Ramses on 21/04/2018.
 */

public class PersonajePrincipal {
    //las caracteristicas del personaje

    String nombre;
    int vida;
    int nivel;
    int armadura;
    int atkFisico;
    int mana;
    int experencia;

    /**
     * Es el primer codigo que se ejecuta al crear el objeto
     * Es tambien donde se inicializa
     * los valores por default de las caracteristicas
     */


    public PersonajePrincipal(){

        nombre = "nuevo";
        vida =1000;
        nivel=1;
        armadura=50;
        atkFisico=60;
        mana=60;
        experencia=0;
    }

    public PersonajePrincipal(String nombre, int vida, int nivel, int armadura, int atkFisico, int mana, int experencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.armadura = armadura;
        this.atkFisico = atkFisico;
        this.mana = mana;
        this.experencia = experencia;
    }

    public void tomarPosion(){
        vida=vida+200;
    }

    public void tomarPosion(int aumento){
        vida=vida+aumento;
    }

    public void atacar(PersonajePrincipal objetivo){
        objetivo.armadura=objetivo.armadura-atkFisico;

        if (objetivo.armadura<0){
            objetivo.vida += objetivo.armadura;
            objetivo.armadura=0;
        }
    }
}
