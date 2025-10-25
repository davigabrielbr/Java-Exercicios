package Banco;

public class ClienteBanco {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Davi", 12345);
        ContaBancaria c2 = new ContaBancaria("Gabriel", 67890);

        System.out.println("=== CONTA 1 ===");
        c1.depositar(500);
        c1.sacar(200);
        c1.mostrarInfo();

        System.out.println("=== CONTA 2 ===");
        c2.depositar(300);
        c2.mostrarInfo();
    }
}