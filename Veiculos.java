import java.util.Scanner;

class Motor {
    private int NumCilindro;
    private int Potencia;

    public Motor() {
        this.NumCilindro = 0;
        this.Potencia = 0;
    }

    public Motor(int numCilindro, int potencia) {
        this.NumCilindro = numCilindro;
        this.Potencia = potencia;
    }

    public void InsertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de cilindros: ");
        this.NumCilindro = scanner.nextInt();
        System.out.println("Digite a potência: ");
        this.Potencia = scanner.nextInt();
    }

    public void Print() {
        System.out.println("Número de cilindros: " + this.NumCilindro);
        System.out.println("Potência: " + this.Potencia);
    }
}

class Veiculo extends Motor {
    private int Peso;
    private int VelocMax;
    private float Preco;

    public Veiculo() {
        this.Peso = 0;
        this.VelocMax = 0;
        this.Preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.Peso = peso;
        this.VelocMax = velocMax;
        this.Preco = preco;
    }

    public void InsertData() {
        super.InsertData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso em quilos: ");
        this.Peso = scanner.nextInt();
        System.out.println("Digite a velocidade máxima em Km/h: ");
        this.VelocMax = scanner.nextInt();
        System.out.println("Digite o preço em R$: ");
        this.Preco = scanner.nextFloat();
    }

    public void Print() {
        super.Print();
        System.out.println("Peso em quilos: " + this.Peso);
        System.out.println("Velocidade máxima em Km/h: " + this.VelocMax);
        System.out.println("Preço em R$: " + this.Preco);
    }
}

class CarroPasseio extends Veiculo {
    private String Cor;
    private String Modelo;

    public CarroPasseio() {
        this.Cor = "";
        this.Modelo = "";
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.Cor = cor;
        this.Modelo = modelo;
    }

    public void InsertData() {
        super.InsertData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cor: ");
        this.Cor = scanner.nextLine();
        System.out.println("Digite o modelo: ");
        this.Modelo = scanner.nextLine();
    }

    public void Print() {
        super.Print();
        System.out.println("Cor: " + this.Cor);
        System.out.println("Modelo: " + this.Modelo);
    }
}

class Caminhao extends Veiculo {
private int Toneladas;
private int AlturaMax;
private int Comprimento;
}

public Caminhao() {
        this.Toneladas = 0;
        this.AlturaMax = 0;
        this.Comprimento = 0;
}
