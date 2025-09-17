import java.util.Scanner;

class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.chequeEspecial = 0;
    }

    public double consultarSaldo() {
        return saldo + chequeEspecial;
    }

    public double consultarChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else if (valor <= saldo + limiteChequeEspecial - chequeEspecial) {
            // Usar cheque especial
            chequeEspecial += (valor - saldo);
            saldo = 0;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean pagarBoleto(double valor) {
        if (valor <= saldo + limiteChequeEspecial - chequeEspecial) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                chequeEspecial += (valor - saldo);
                saldo = 0;
            }
            cobrarTaxaChequeEspecial();
            return true;
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto!");
            return false;
        }
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeEspecial > 0;
    }

    private void cobrarTaxaChequeEspecial() {
        if (chequeEspecial > 0) {
            double taxa = chequeEspecial * 0.20;
            if (saldo >= taxa) {
                saldo -= taxa;
                chequeEspecial -= taxa;
                System.out.println("Taxa de 20% sobre o cheque especial cobrada: R$" + taxa);
            } else {
                System.out.println("Saldo insuficiente para cobrar a taxa de 20% do cheque especial.");
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Cheque especial disponível: R$" + (limiteChequeEspecial - chequeEspecial));
        System.out.println("Total disponível (Saldo + Cheque Especial): R$" + consultarSaldo());
    }
}

