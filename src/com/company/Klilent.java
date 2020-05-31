package com.company;

import java.nio.charset.Charset;
import java.util.Random;

public class Klilent {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private float zarobekMiesiecznyNetto;
    private String login;
    private String haslo;
    private float saldo;

    public Klilent(String imie,String nazwisko, String dataUrodzenia){

       this.imie=imie;
       this.nazwisko= nazwisko;
       this.dataUrodzenia=dataUrodzenia;
        Random rand=new Random();
        login =nazwisko.substring(0,3)+imie.substring(0,3)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
        saldo=0;
        zarobekMiesiecznyNetto=0;


    }





    public void setImie(String imie){
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public void setDataUrodzenia(String dataUrodzenia){
        this.dataUrodzenia=dataUrodzenia;
    }
    public void setLogin(String login){
        this.login=login;
    }
    public void setHaslo(String haslo){
        this.haslo=haslo;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public void setZarobekMiesiecznyNetto(float zarobekMiesiecznyNetto){
        this.zarobekMiesiecznyNetto=zarobekMiesiecznyNetto;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getDataUrodzenia(){
        return dataUrodzenia;
    }
    public String getLogin(){
        return login;
    }
    public String getHaslo(){
        return haslo;
    }
    public float getZarobekMiesiecznyNetto(){
        return zarobekMiesiecznyNetto;
    }
    public float getSaldo(){
        return  saldo;
    }

}
