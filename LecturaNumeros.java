import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
public class LecturaNumeros extends BufferedReader {
    public LecturaNumeros(){
        super(new InputStreamReader(System.in));
    }
    public LecturaNumeros(Reader r){
        super(r);
    }
    public int readInt() throws IOException{
        return Integer.parseInt(readLine());
    }
    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInt();
    }
    public Integer readInteger() throws IOException {
        return Integer.valueOf(readLine());
    }
    public Integer readInteger(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInteger();
    }
    public double readDouble() throws IOException {
        return Double.parseDouble(readLine());
    }
    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readDouble();
    }
}