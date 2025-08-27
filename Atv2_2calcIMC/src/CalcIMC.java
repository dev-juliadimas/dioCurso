import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, peso, imc;

        try {
            // Solicita o peso e a altura
            System.out.print("Peso (em kilogramas): ");
            peso = sc.nextDouble();

            System.out.print("Altura (em metros): ");
            altura = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números válidos.");
            sc.nextLine(); // Limpa o buffer
            return; // Encerra o programa após erro
        }

        Calculo IMC = new Calculo(altura, peso);
        imc = IMC.getImc();

        System.out.printf(  "  Peso: %.2f \n" +
                            "Altura: %.2f \n" +
                            "   IMC: %.2f \n"
                , IMC.getPeso(), IMC.getAltura(), imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        }else if (imc >= 39.9) {
            System.out.println("Obesidade III (Mórbida)");
        }

        sc.close();
    }
}
