import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, parImpar, i;

        System.out.print("Informe o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.print("Informe o segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Escolha 1 ou 2:");
        System.out.println("1 - Ímpar");
        System.out.println("2 - Par");
        parImpar = sc.nextInt();

        if(parImpar != 1 && parImpar != 2){
            System.out.println("Você não escolheu nem ímpar e nem par");
        }else {
            if (num1 == num2) {
                System.out.println("Você inseriu números iguais");
            } else if (num1 < num2) {
                for (i = num1; i <= num2; i++) {
                    if (parImpar == 1) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    } else if (parImpar == 2) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
            } else if (num1 > num2) {
                for (i = num2; i <= num1; i++) {
                    if (parImpar == 1) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    } else if (parImpar == 2) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
            }

        }
        sc.close();
    }
}
