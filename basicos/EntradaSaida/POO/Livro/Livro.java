package POO.Livro;

public class Livro {
    public static void main(String[] args) {
        CriandoLivro l1 = new CriandoLivro();
        l1.titulo = "Nada pode me ferir";
        l1.autor = "David Goggins";
        l1.editora = "Editora Sextante";
        l1.totalPaginas = 320;

        System.out.println("Livro 1");
        l1.abrir();
        l1.status();
        l1.ler();

        CriandoLivro l2 = new CriandoLivro();
        l2.titulo = "Hábitos Atômicos";
        l2.autor = "James Clear";
        l2.editora = "Alfa Life";
        l2.totalPaginas = 320;

        System.out.println("---------------------------------");
        System.out.println("Livro 2");
        l2.fechar();
        l2.status();
        l2.ler();
    }
}