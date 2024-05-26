public class Circle extends Figure{
    double radio;
    public Circle(String color, double radio){
        super(color);
        this.radio=radio;
    }
    @Override
    public double area(){
        double area=Math.PI*radio*radio;
        return area;
    }
    @Override
    public double perimeter(){
        double perimetro=2*Math.PI*radio;
        return perimetro;
    }
    @Override
    public String getColor(){
        return color;
    }
}