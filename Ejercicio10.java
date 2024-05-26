public class Ejercicio10{
    public static void main(String[] args){
        Figure[] figures={
            new Triangle("Rojo", 3, 4, 5, 5),
            new Circle("Verde", 3),
            new Rectangle("Azul", 4, 6),
            new Hexagon("Amarillo", 10, 5)
        };
        for (Figure figure:figures){
            System.out.println("Color: "+figure.getColor()+", Perimetro: "+figure.perimeter()+", Area: "+figure.area());
        }
    }
}