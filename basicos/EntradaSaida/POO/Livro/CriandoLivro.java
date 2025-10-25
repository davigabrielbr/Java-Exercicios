package Livro;

public class CriandoLivro {
    String titulo;
    String autor;
    String editora;
    int totalPaginas;
    boolean aberto;

    void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Total de páginas: " + this.totalPaginas);
        System.out.println("Está aberto: " + this.aberto);
    }

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }

    void ler() {
        if (this.aberto == true) {
            System.out.println("Lendo o livro " + this.titulo + "...");
        } else {
            System.out.println("Abrir o livro " + this.titulo + " antes de ler!");
        }
    }
}