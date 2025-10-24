package POO.ContaBancariaExercicio;

public class ContaBanco {
    public int numeroConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;
    
    public void statusAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.issStatusConta());
    }

    public ContaBanco() {
        this.setSaldoConta(0);
        this.setStatusConta(false);
    }

    public void abrirConta(String tipo) {
        this.setTipoConta(tipo);
        this.setStatusConta(true);

        if (tipo == "CC") {
            this.setSaldoConta(50);
        } else if (tipo == "CP") {
            this.setSaldoConta(150);
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double valor) {
        if (this.issStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDonoConta());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(double valor) {
        if (this.issStatusConta()) {
            if (this.getSaldoConta() >= valor) {
                this.setSaldoConta(this.getSaldoConta() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Conta fechada, impossível sacar!");
        }
    }

    public void pagarMensal() {
        double v = 0;

        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }

        if (this.issStatusConta()) {
            if (this.getSaldoConta() > v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDonoConta());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta fechada, impossível pagar");
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

    public boolean issStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}