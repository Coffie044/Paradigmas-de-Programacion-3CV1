public class Hexagon implements Figure{
    double lado, apotema;
    String color;
    public Hexagon(double lado, double apotema, String color){
        this.lado=lado;
        this.apotema=apotema;
        this.color=color;
    }
    @Override
    public double area(){
        double area=(perimeter()*apotema)/2;
        return area;
    }
    @Override
    public double perimeter(){
        double perimetro=lado*6;
        return perimetro;
    }
    @Override
    public String getColor(){
        return color;
    }
}