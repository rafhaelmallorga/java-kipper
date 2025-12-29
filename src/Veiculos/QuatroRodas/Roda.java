package Veiculos.QuatroRodas;

import java.util.ArrayList;

public class Roda {
    String marca;
    String modelo;
    String cor;
    short aro;
    ArrayList<Carro> carros = new ArrayList<Carro>();

    public Roda(String marca, String modelo, String cor, short aro) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.aro = aro;
    }

    public void addNewCarro(Carro carro) {
        carros.add(carro);
        System.out.println("Carro adicionado com sucesso: " + carro);
    }

    public ArrayList<Carro> getCarros() {
        return this.carros;
    }
}
