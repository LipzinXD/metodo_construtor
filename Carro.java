public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valor; 

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAro() {
        return aro;
    }
    public void setAro(int aro) {
        this.aro = aro;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

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