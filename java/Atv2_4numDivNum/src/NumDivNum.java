import java.util.Scanner;

public class NumDivNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numeroInicial;

        System.out.print("Informe o número inicial: ");
        numeroInicial = sc.nextInt();

        if (numeroInicial <= 0) {
            System.out.println("O número inicial deve ser maior que zero.");
            sc.close();
            return;
        }
        while (true) {
            System.out.print("Informe outro número (ou um número menor que o inicial para ignorar): ");
            numero = sc.nextInt();
            if (numero < numeroInicial) {
                System.out.println("Número ignorado, pois é menor que o número inicial.");
                continue;
            }
            if (numero % numeroInicial != 0) {
                System.out.println("Resto da divisão do número informado pelo número inicial é diferente de 0.");
                break;
            }
        }

        sc.close();
    }
}
