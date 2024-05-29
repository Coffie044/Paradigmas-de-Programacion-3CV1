public class Ejercicio11{
    public static void main(String[] args){
        Figure[] figures={
            new Triangle(3, 4, 5, 5, "Rojo"),
            new Circle(3, "Verde"),
            new Rectangle(4, 6, "Azul"),
            new Hexagon(10, 5, "Amarillo")
        };
        for (Figure figure:figures){
            System.out.println("Color: "+figure.getColor()+", Perimetro: "+figure.perimeter()+", Area: "+figure.area());
        }
    }
}