class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar() {
        System.out.println("Acelerando o veículo");
    }

    public void frear() {
        System.out.println("Freando o veículo");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 240);
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 40);
        System.out.println("Freando o carro");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 120);
        System.out.println("Acelerando a moto");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 50);
        System.out.println("Freando a moto");
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 5);
        System.out.println("Acelerando a bicicleta");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 2);
        System.out.println("Freando a bicicleta");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Supra", 1994);
        Moto moto = new Moto("Kawasaki", "Ninja 600", 2022);
        Bicicleta bicicleta = new Bicicleta("Goldgenie", "24k Gold Extreme Mountain Bike", 2020);

        executar(carro);
        executar(moto);
        executar(bicicleta);
    }

    public static void executar(Veiculo veiculo) {
        System.out.println("Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAnoFabricacao() + ")");
        veiculo.acelerar();
        System.out.println("Acelerando: Velocidade atual = " + veiculo.getVelocidade() + " km/h");
        veiculo.frear();
        System.out.println("Freando: Velocidade atual = " + veiculo.getVelocidade() + " km/h");
        System.out.println();
    }
}
