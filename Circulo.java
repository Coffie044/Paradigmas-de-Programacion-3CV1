public class Circulo{
    private String color;
    private double radio;
    public Circulo(String color, double radio){
        this.color=color;
        this.radio=radio;
    }
    public String getColor(){
        return color;
    }
    public double getRadio(){
        return radio;
    }
    private double area(){
        double area;
        area=Math.PI*radio*radio;
        return area;
    }
    private double perimetro(){
        double perimetro;
        perimetro=Math.PI*2*radio;
        return perimetro;
    }
    public double getArea(){
        return area();
    }
    public double getPerimetro(){
        return perimetro();
    }
}
