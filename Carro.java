public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valor; 

    public Carro(){


    }
    public Carro(int aro){
        this.aro=aro;
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }
    public Carro(int aro, String modelo, String cor, double valor){
        this.aro=aro;
        this.modelo=modelo;
        this.valor=valor;
        this.cor=cor;
    }
}