package POO;

public class Exercicio2Aula04 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro(); // Construtor vazio 
        c1.setNome("Peppa");
        c1.setRaca("Lhasa apso");
        c1.setIdade(10);

        System.out.println("Cachorro 1");
        c1.mostrarInfo();

        Cachorro c2 = new Cachorro("Mel", "Lhasa apso", 5); // Construtor com parâmetros
        System.out.println("Cachorro 2");
        c2.mostrarInfo();
    }
}