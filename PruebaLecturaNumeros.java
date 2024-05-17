import java.io.IOException;
public class PruebaLecturaNumeros{
    public static void main(String[] args) {
        LecturaNumeros ln = new LecturaNumeros();
        try{
            int num1 = ln.readInt("Introduce un número entero: ");
            int num2 = ln.readInt("Introduce un segundo número entero: ");
            Integer num3 = ln.readInteger("Introduce un número entero (Integer): ");
            double num4 = ln.readDouble("Introduce un número decimal: ");
            double num5 = ln.readDouble("Introduce otro número decimal: ");
            System.out.println("Números leídos:");
            System.out.println("Primer número entero (int): " + num1);
            System.out.println("Segundo número entero (int): " + num2);
            System.out.println("Número entero (Integer): " + num3);
            System.out.println("Primer número decimal (double): " + num4);
            System.out.println("Segundo número decimal (double): " + num5);
        }catch (IOException e){
            System.err.println("Error al leer los datos: " + e.getMessage());
        }
    }
}