public class Ejercicio6{
    public static void main(String[] args){
        Circulo c1=new Circulo("Rojo", 2);
        System.out.println("\nCIRCULO");
        System.out.println("Color: "+c1.getColor());
        System.out.println("Radio: "+c1.getRadio());
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimetro: "+c1.getPerimetro());
        Rectangulo r1=new Rectangulo("Azul", 5, 3);
        System.out.println("\nRECTANGULO");
        System.out.println("Color: "+r1.getColor());
        System.out.println("Base: "+r1.getBase());
        System.out.println("Altura: "+r1.getAltura());
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimetro: "+r1.getPerimetro());
        Cuadrado q1=new Cuadrado("Verde", 3);
        System.out.println("\nCUADRADO");
        System.out.println("Color: "+q1.getColor());
        System.out.println("Lado: "+q1.getLado());
        System.out.println("Area: "+q1.getArea());
        System.out.println("Perimetro: "+q1.getPerimetro());
        Triangulo t1=new Triangulo("Morado", 5, 3, 3, 3);
        System.out.println("\nTRIANGULO");
        System.out.println("Color: "+t1.getColor());
        System.out.println("Base: "+t1.getBase());
        System.out.println("Altura: "+t1.getAltura());
        System.out.println("Area: "+t1.getArea());
        System.out.println("Perimetro: "+t1.getPerimetro());
    }
}
