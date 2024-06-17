import java.io.*;
import java.net.*;
public class Servidor{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket=new ServerSocket(32205);
            System.out.println("Esperando una conexión...");
            while(true){
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Conexión desde "+clienteSocket.getInetAddress().getHostAddress());
                BufferedReader entrada=new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                PrintWriter salida=new PrintWriter(clienteSocket.getOutputStream(), true);
                String mensajeCliente = entrada.readLine();
                System.out.println("Recibido: " + mensajeCliente);
                String respuesta="Mensaje recibido";
                salida.println(respuesta);
                clienteSocket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
