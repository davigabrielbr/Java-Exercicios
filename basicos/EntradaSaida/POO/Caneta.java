package POO;

public class Caneta {
    public static void main(String[] args) {
        CriandoCaneta c1 = new CriandoCaneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; Atríbuto privado
        c1.carga = 80;
        // c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
