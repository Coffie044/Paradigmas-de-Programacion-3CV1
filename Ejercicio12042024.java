public class Ejercicio12042024{
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", "Perez", "Masculino", "Mexicana", "Maestria", 25, 12345678);
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Apellido: "+p1.getApellido());
        System.out.println("Genero: "+p1.getGenero());
        System.out.println("Nacionalidad: "+p1.getNacionalidad());
        System.out.println("Eduacion: "+p1.getEducacion());
        System.out.println("Edad: "+p1.getEdad());
        System.out.println("Telefono: "+p1.getTelefono());

    }
}