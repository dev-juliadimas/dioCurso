import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int anoNascimento;

        System.out.print("Nome:");
        nome = sc.nextLine();
        System.out.print("Ano nascimento:");
        anoNascimento = sc.nextInt();

        var pessoa = new Pessoa(nome, anoNascimento);

        System.out.printf("Olá %s você tem %d anos", pessoa.getNome(), pessoa.getIdade());
        sc.close();
    }
}