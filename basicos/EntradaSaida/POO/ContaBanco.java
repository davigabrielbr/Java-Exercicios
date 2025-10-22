package POO;

public class ContaBanco {
    public int numeroConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;
    
    public ContaBanco(int numeroConta, String tipoConta, String donoConta, double saldoConta, boolean statusConta) {
        this.saldoConta = 0;
        this.statusConta = false;
    }
    
    public void abrirConta(String tipo) {
        this.setTipoConta(tipo);
        this.setStatusConta(true);

        if (tipo == "CC") {
            this.setSaldoConta(50);
        } else if (tipo == "CP") {
            this.setSaldoConta(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatusConta(false);
        }
    }

    public void depositar(double valor) {
        if (this.statusConta == true) {
            this.setSaldoConta(this.getSaldoConta() + valor);
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(double valor) {
        if (this.statusConta == true) {
            if (this.getSaldoConta() > 0) {
                this.setSaldoConta(this.getSaldoConta() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        double v = 0;

        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }

        if (this.statusConta == true) {
            if (this.getSaldoConta() > v) {
                this.setSaldoConta(this.getSaldoConta() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean StatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}