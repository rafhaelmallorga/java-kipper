package Biologia;

public class SerHumano extends SerVivo {
    public SerHumano(short idade){
        super(idade);
    }
    public void respirar() {
        System.out.println("Inalando Oxigenio e exalando CO2");
    }
}
