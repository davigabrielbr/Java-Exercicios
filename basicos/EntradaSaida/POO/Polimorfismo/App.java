package Polimorfismo;

public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero(); 
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Reptil r = new Reptil();
        Cobra cr = new Cobra();
        Tartaruga t = new Tartaruga();
        Peixe p = new Peixe();
        Goldfish g = new Goldfish();
        Ave a = new Ave();
        Arara ae = new Arara();

        // Polimorfismo

        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();  // Correndo 
        m.alimentar();  // Mamando
        m.emitirSom();  // Som de Mamífero

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();  // Saltando
        c.alimentar();  // Mamando
        c.emitirSom();  // Somd e Mamífero
        c.usarBolsa();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();  // Nadando
        p.alimentar();  // Comendo substâncias
        p.emitirSom();  // Peixe não faz som
        p.soltarBolha();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();  // Correndo
        k.alimentar();  // Mamando 
        k.emitirSom();  // Som de Mamífero
        k.abanarRabo();

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();  // Voando
        a.alimentar();  // Comendo frutas
        a.emitirSom();  // Som de ave
        a.fazerNinho();

        r.locomover();  // Rastejando 
        r.alimentar();  // Comendo vegetais
        r.emitirSom();  // Som de reptil

        cr.locomover(); 
        t.locomover();
        g.locomover();
        ae.locomover();
    }
}