public class CarroSUV extends Carro {
    private int capacidadeCarga;

    public CarroSUV(String marca, String modelo, int capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro SUV: " + getMarca() + " " + getModelo() + " - Capacidade de Carga: " + capacidadeCarga + " kg");
    }
}
