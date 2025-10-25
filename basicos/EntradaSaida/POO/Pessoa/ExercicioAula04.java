package Pessoa;

public class ExercicioAula04 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi", 21);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        p1.setIdade(25);
        System.out.println(p1.getIdade());
    }
}