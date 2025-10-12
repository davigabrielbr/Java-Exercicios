import java.util.Scanner;

public class SaudacaoUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao Java!");

        teclado.close();
    }
}