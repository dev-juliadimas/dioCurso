import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;

        System.out.print("Digite um número para calcular a tabuada: ");
        num = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
}
