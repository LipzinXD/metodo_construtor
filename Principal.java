public class Principal {

    public static void main(String[] args){

        Carro car = new Carro();
        Carro carAro = new Carro(20);
        Carro carQuatroParametros = new Carro( 20, "Gol quadrado", "Preto", 40000);

        System.out.println(carAro.getAro());
        System.out.println(carQuatroParametros.getModelo());
        System.out.println(carQuatroParametros.getCor());
        System.out.println(carQuatroParametros.getValor());
    }
}
