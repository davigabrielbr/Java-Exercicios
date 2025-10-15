import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (digite 0 para parar): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma dos valores digitados: " + soma);
        
        scanner.close();
    }
}