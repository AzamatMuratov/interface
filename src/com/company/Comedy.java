package com.company;

public class Comedy implements film{
    public String nazvanie_comedy;
    public String imya_rezhissera = "Kventin Tarantino";
    public int views1 = 14000000;
    public Comedy(String nazvanie_comedy){
        this.nazvanie_comedy = nazvanie_comedy;
    }
    public void komediya(){
        System.out.println(this.nazvanie_comedy + " this comedy");
    }
    public void showZhanr(){
        System.out.println("Komediya - " + this.nazvanie_comedy);
    }
    public void Rezhisser(){
        System.out.println("Rezhisser komediinogo filma - " + this.imya_rezhissera);
    }
    public void Prosmotry(){
        System.out.println("U komediinogo filma - "+ this.views1 + " prosmotrov");
    }
}