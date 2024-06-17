import java.io.*;
import java.net.*;
public class Cliente{
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 32205);
            System.out.println("Conectado a " + socket.getInetAddress().getHostAddress());
            PrintWriter salida=new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje="¡Hola, servidor!";
            System.out.println("Enviando: " + mensaje);
            salida.println(mensaje);
            String respuestaServidor=entrada.readLine();
            System.out.println("Recibido del servidor: " + respuestaServidor);
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}