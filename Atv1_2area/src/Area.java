import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Lado do quadrado: ");
        lado = sc.nextDouble();

        var area = new CalculaArea(lado);
        System.out.printf("Area: %.2f%n", area.getArea());

    }
}
