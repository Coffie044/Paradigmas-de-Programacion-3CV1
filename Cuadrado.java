public class Cuadrado{
    private String color;
    private double lado;
    public Cuadrado(String color, double lado){
        this.color=color;
        this.lado=lado;
    }
    public String getColor(){
        return color;
    }
    public double getLado(){
        return lado;
    }
    private double area(){
        double area;
        area=lado*lado;
        return area;
    }
    private double perimetro(){
        double perimetro;
        perimetro=4*lado;
        return perimetro;
    }
    public double getArea(){
        return area();
    }
    public double getPerimetro(){
        return perimetro();
    }
}