package ExercicioPratico;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Davi Gabriel", 21, "M");
        p[1] = new Pessoa("Adrielly Dornelas", 24, "F");

        l[0] = new Livro("Nada pode me ferir", "David Goggins", 320, p[0]);
        l[1] = new Livro("O futuro da humanidade", "Augusto Cury", 250, p[1]);
        l[2] = new Livro("Dando a volta por cima", "John C. Maxwell", 235, p[0]); 
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(50);
        l[1].avancarPagina();
        System.out.println(l[1].detalhes());
    }
}