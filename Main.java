package Empresa;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.insertData();
        System.out.println("\n--- Dados do Restaurante ---");
        restaurante.print();
    }
}
