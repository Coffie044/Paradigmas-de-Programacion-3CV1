public class Rectangle implements Figure{
    double base, altura;
    String color;
    public Rectangle(double base, double altura, String color) {
        this.base=base;
        this.altura=altura;
        this.color=color;
    }
    @Override
    public double area(){
        double area=base*altura;
        return area;
    }
    @Override
    public double perimeter(){
        double perimetro=(2*base)+(2*altura);
        return perimetro;
    }
    @Override
    public String getColor(){
        return color;
    }
}