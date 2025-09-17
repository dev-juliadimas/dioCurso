public class CalculaArea {
    private double area;
    private double altura;
    private double base;
    public CalculaArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = this.altura * this.base;
    }
    public double area() {
        return this.area;
    }
    public double altura() {
        return this.altura;
    }
    public double getArea() {
        return this.area;
    }
    public double getAltura() {
        return this.altura;
    }
    public double getBase() {
        return this.base;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
}
