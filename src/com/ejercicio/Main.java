package com.ejercicio;

public class Main {
    public static void main(String[] args) {

        String [] nombres ={"Hugo","Paco", "Luis"};
        String sobrinos ="";

        for (int i = 0; i < nombres.length; i++) {

            sobrinos= sobrinos.concat(" "+nombres[i]);

        }
        System.out.println(sobrinos);
    }
}