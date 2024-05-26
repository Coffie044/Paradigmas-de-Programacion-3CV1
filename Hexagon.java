public class Hexagon extends Figure{
    double lado, apotema;
    public Hexagon(String color, double lado, double apotema){
        super(color);
        this.lado=lado;
        this.apotema=apotema;
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