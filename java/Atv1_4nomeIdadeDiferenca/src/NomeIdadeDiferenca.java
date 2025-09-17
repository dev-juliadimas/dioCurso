import java.util.Scanner;

public class NomeIdadeDiferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Primeiro nome: ");
        nome1 = sc.nextLine();
        System.out.printf("idade de %s: ", nome1);
        idade1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Segundo nome: ");
        nome2 = sc.nextLine();
        System.out.printf("idade de %s: ", nome2);
        idade2 = sc.nextInt();

        var calcIdade = new CalcIdade(idade1, idade2);

        System.out.printf("%s tem %d anos\n", nome1, calcIdade.getIdade1());
        System.out.printf("%s tem %d anos\n", nome2, calcIdade.getIdade2());
        if (calcIdade.getIdade1() > calcIdade.getIdade2()) {
            System.out.printf("%s tem %d anos a mais que %s", nome1, calcIdade.getDiferenca(), nome2);
        }else if (calcIdade.getIdade1() < calcIdade.getIdade2()) {
            System.out.printf("%s tem %d anos a mais que %s", nome2, calcIdade.getDiferenca(), nome1);
        }else {
            System.out.printf("%s e %s tem a mesma idade", nome1, nome2);
        }
        sc.close();
    }
}
