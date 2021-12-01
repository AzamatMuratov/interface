package com.company;

public class Main {

    public static void main(String[] args) {
        otech_film film_otech = new otech_film("Zhau zhurek myn bala");  // название фильма
        Comedy comedy = new Comedy("Odin doma");     // название фильма
        outputFilm(film_otech);   // общая функия которая показывает все что есть в интерфейсе
        outputFilm(comedy);       // общая функия которая показывает все что есть в интерфейсе
    }
    public static void outputFilm(film Film) {
        Film.showZhanr();   // Показывает Жанр фильма
        Film.Rezhisser();   // Показывает Режиссера
        Film.Prosmotry();   // Показывает Просмотры
    }
}
