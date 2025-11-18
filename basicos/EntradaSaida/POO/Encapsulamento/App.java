package Encapsulamento;

public class App {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();
    }
}