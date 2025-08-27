public class Calculo {
    private double altura;
    private double peso;
    private double imc;

    public Calculo(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        this.imc = this.peso / (this.altura * this.altura);
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
        this.imc = this.peso / (this.altura * this.altura);
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.imc = this.peso / (this.altura * this.altura);
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
        this.imc = this.peso / (this.altura * this.altura);
    }
}
