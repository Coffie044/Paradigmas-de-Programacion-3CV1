public class Rectangulo{
    private String color;
    private double base, altura;
    public Rectangulo(String color, double base, double altura){
        this.color=color;
        this.base=base;
        this.altura=altura;
    }
    public String getColor(){
        return color;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    private double area(){
        double area;
        area=base*altura;
        return area;
    }
    private double perimetro(){
        double perimetro;
        perimetro=(2*base)+(2*altura);
        return perimetro;
    }
    public double getArea(){
        return area();
    }
    public double getPerimetro(){
        return perimetro();
    }
}