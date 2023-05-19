package Empresa;
import java.util.Scanner;
public class Restaurante {
    private static final String String = null;
    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone,
                       String tipoComida, double precoMedioPrato) {
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insertData() {
        insert();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de comida: ");
        tipoComida = scanner.nextLine();

        System.out.print("Preço médio de um prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void print() {
        super.print();
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio de um prato: " + precoMedioPrato);
    }
}
}
