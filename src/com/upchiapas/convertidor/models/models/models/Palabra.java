package com.upchiapas.convertidor.models.models.models;
import  java.util.Stack;
public class Palabra {
    private String palabra;
    String auxPila="";
    String singnos="";
    String letras ="";
    public Palabra(String palabra){
        this.palabra=palabra;
    }
    public  void IngresoPila(String palabra){
        System.out.println("entra a pila");
        Stack<Character> pila = new Stack<Character>();
        for(int i=0;i<palabra.length();i++){
            pila.push(palabra.charAt(i));
        }
        while(!pila.isEmpty()){
            auxPila="";
            auxPila=auxPila+pila.pop();
            compara(auxPila);
        }
    }
    public void compara(String auxPila){

        if(auxPila.equals("/")|| auxPila.equals("*")||auxPila.equals("-")||auxPila.equals("+")){
            singnos=singnos+auxPila;
        }else{
            letras=letras+auxPila;
        }
        System.out.println("\n"+singnos+""+letras);
    }
}
