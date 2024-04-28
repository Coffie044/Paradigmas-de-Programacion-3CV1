public class Triangulo {
    private String color;
    private double base, altura, lado1, lado2;
    public Triangulo(String color, double base, double altura, double lado1, double lado2){
        this.color=color;
        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
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
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    private double area(){
        double area;
        area=(base*altura)/2;
        return area;
    }
    private double perimetro(){
        double perimetro;
        perimetro=base+lado1+lado2;
        return perimetro;
    }
    public double getArea(){
        return area();
    }
    public double getPerimetro(){
        return perimetro();
    }
}
