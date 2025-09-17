import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();

        var pessoa = new Pessoa(nome, idade);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade());
    }
}
