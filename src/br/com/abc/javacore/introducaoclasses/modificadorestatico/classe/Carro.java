package br.com.abc.javacore.introducaoclasses.modificadorestatico.classe;

import java.sql.SQLOutput;

public class Carro {
    // Velocidade limite 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;


    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(){

    }



    public void imprime(){
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade Maxima "+this.velocidadeMaxima);
        System.out.println("Velocidade limite "+ velocidadeLimite);
        System.out.println("-----------");
    }



    public static void setVelocidadeLimite (double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }




    public void setNome(String nome){
        this.nome =nome;
    }
    public String getNome(){
        return nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima =velocidadeMaxima;
    }
    public double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }


}
