import java.util.Scanner;

public class InformacoesPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer
        
        System.out.print("Digite a sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.printf("Olá, %s! Você tem %d anos e mora em %s.", nome, idade, cidade);

        scanner.close();
    }
}