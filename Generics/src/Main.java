public class Main {
    public static void main(String[] args) {

        Garagem<Carro> garagem = new Garagem<>();

        garagem.adicionarCarro(new CarroEsportivo("Ferrari", "F8", 340));
        garagem.adicionarCarro(new CarroEsportivo("Lamborghini", "Huracán", 325));
        garagem.adicionarCarro(new CarroEsportivo("Porsche", "911", 300));

        garagem.adicionarCarro(new CarroSUV("Toyota", "Hilux", 1000));
        garagem.adicionarCarro(new CarroSUV("Ford", "Ecosport", 500));
        garagem.adicionarCarro(new CarroSUV("Jeep", "Renegade", 600));

        System.out.println("Carros na garagem:");
        garagem.exibirCarros();
    }
}
