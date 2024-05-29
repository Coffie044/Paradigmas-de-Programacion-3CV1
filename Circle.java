public class Circle implements Figure{
    double radio;
    String color;
    public Circle(double radio, String color){
        this.radio=radio;
        this.color=color;
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