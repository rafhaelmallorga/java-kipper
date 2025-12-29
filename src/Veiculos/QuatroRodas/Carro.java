package Veiculos.QuatroRodas;

public class Carro implements ICarros {
    String marca;
    String modelo;
    String cor;
    short year;
    String formattedName;
    public Carro(String marca, String modelo, String cor, short year) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.year = year;
        this.formattedName = marca + " " + modelo + " " + cor + " " + year;
        System.out.println("Carro: " + formattedName + " criado com sucesso!");
    }

    public void acelerar() {
        System.out.println("Hey! Hey! Cowboy!");
        System.out.println("Voce esta acelerando de mais seu possante: " + this.formattedName);
    }

    public void frear() {
        System.out.println("Reduzindo a velocidade.");
    }

    public void parar() {
        System.out.println("Parado.");
    }
}