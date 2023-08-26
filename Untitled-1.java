// Classe para demonstrar o carro.
public class Carro2 {
    //ficha do carro
    String marca;
    String modelo;
    int anoFabricado;
    String cor;

    //Construcao da Classe carro
    public Carro2(String marca, String modelo, int anoFabricado, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricado = anoFabricado;
        this.cor = cor;

    }

    //exibir ficha do carro
    public void ficha() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("anofabricado: " + anoFabricado);
        System.out.println("cor: " + cor);

    }

    //Testar a Classe carro
    public static void main(String[] args) {

        // criar objeto do carro

 Carro2 meucarro = new Carro2("VW","Fusca",1993,"Branco");

         meucarro.ficha();

    }

}



