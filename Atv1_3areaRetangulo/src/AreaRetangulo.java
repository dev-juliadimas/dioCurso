import java.awt.geom.Area;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura;

        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        altura = sc.nextDouble();

        var area = new CalculaArea(base, altura);

        System.out.printf("Altura: %.2fn", area.getArea());
        sc.close();
    }
}
