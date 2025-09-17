public class CalculaArea {
    private double lado;
    private double area;
    public CalculaArea(double lado) {
        this.area = lado * lado;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}
