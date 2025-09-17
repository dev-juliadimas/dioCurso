public class CalcIdade {
    private int idade1, idade2, diferenca;
    public CalcIdade(int idade1, int idade2) {
        this.idade1 = idade1;
        this.idade2 = idade2;

        if (idade1 > idade2) {
            this.diferenca = idade1 - idade2;
        }else if (idade1 < idade2) {
            this.diferenca = idade2 - idade1;
        } else if (idade1 == idade2) {
            this.diferenca = 0;
        }
    }
    public int getIdade1() {
        return idade1;
    }
    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }
    public int getIdade2() {
        return idade2;
    }
    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }
    public int getDiferenca() {
        return diferenca;
    }
    public void setDiferenca(int diferenca) {
        this.diferenca = diferenca;
    }
}
