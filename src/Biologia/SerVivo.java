package Biologia;

public abstract class SerVivo {
    protected short idade;

    public SerVivo(short idade){
        this.idade = idade;
    }

    public void idade() {
        System.out.println("Idade: " + this.idade);
    }

    public abstract void respirar();

    public void dormir() {
        System.out.println("Dormindo...");
    }
}
