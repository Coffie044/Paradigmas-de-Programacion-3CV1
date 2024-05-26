public class Rectangle extends Figure{
    double base, altura;
    public Rectangle(String color, double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
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