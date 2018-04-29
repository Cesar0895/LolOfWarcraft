package com.example.cesarramses.lolofwarcraft;

/**
 * Created by Cesar Ramses on 21/04/2018.
 */

public class PersonajePrincipal {
    //las caracteristicas del personaje

    protected String nombre;
    protected int vida;
    protected int nivel;
    protected int armadura;
    protected int atkFisico;
    protected int mana;
    protected int experencia;

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

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtkFisico() {
        return atkFisico;
    }

    public void setAtkFisico(int atkFisico) {
        this.atkFisico = atkFisico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperencia() {
        return experencia;
    }

    public void setExperencia(int experencia) {
        this.experencia = experencia;
    }
    //Fin de region Getters y Setters

    //metodos Generales
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
    }//atacar
}
