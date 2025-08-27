import java.time.LocalDate;

public class Pessoa{
    private String nome;
    private int anoNascimento;
    private int idade;
    private int anoAtual;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.anoAtual = LocalDate.now().getYear();

        this.idade = this.anoAtual - this.anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
