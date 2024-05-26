public class Triangle extends Figure{
    double base, altura, lado1, lado2;
    public Triangle(String color, double base, double altura, double lado1, double lado2){
        super(color);
        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    @Override
    public double area(){
        double area=(base*altura)/2;
        return area;
    }
    @Override
    public double perimeter(){
        double perimetro=base+lado1+lado2;
        return perimetro;
    }
    @Override
    public String getColor(){
        return color;
    }
}