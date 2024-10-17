public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, double velocidadeMaxima) {
        super(marca, modelo);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Esportivo: " + getMarca() + " " + getModelo() + " - Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}
