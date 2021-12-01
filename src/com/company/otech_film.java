package com.company;

public class otech_film implements film {
    public String nazvanie_otech;
    public String Rezhisser_imya = "Aqan Sataev";
    public int views = 10000000;
    public otech_film(String nazvanie_otech){
        this.nazvanie_otech = nazvanie_otech;
    }

    public void Otechfilm(){
        System.out.println(this.nazvanie_otech + " otechestvennyi film - ");
    }
    @Override
    public void showZhanr(){
        System.out.println("otechestvennyi film - " + this.nazvanie_otech);
    }
    public void Rezhisser(){
        System.out.println("Rezhisser otechestvennogo filma - " + this.Rezhisser_imya);
    }
    public void Prosmotry(){
        System.out.println("U Otechestvennogo filma - "+ this.views + " prosmotrov");
    }
}