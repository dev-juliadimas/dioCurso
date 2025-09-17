import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do depósito inicial: R$");
        double depositoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        while (true) {
            // Menu de operações
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Exibir informações da conta");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$" + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Cheque especial disponível: R$" + conta.consultarChequeEspecial());
                    break;
                case 3:
                    System.out.print("Informe o valor a depositar: R$");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.print("Informe o valor a sacar: R$");
                    double saque = sc.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 5:
                    System.out.print("Informe o valor do boleto: R$");
                    double boleto = sc.nextDouble();
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    }
                    break;
                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está usando o cheque especial.");
                    } else {
                        System.out.println("A conta não está usando o cheque especial.");
                    }
                    break;
                case 7:
                    conta.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
