public class Ejercicio7{
    public static void main(String[] args){
        Punto3D pto1=new Punto3D(5, 5, 5);
        System.out.println("Punto A: ("+pto1.getX()+", "+pto1.getY()+", "+pto1.getZ()+")");
        Punto3D pto2=new Punto3D();
        System.out.println("Punto B: ("+pto2.getX()+", "+pto2.getY()+", "+pto2.getZ()+")");
        System.out.println("Distancia entre el punto A y el punto B: "+pto1.distancia(pto2)+"\n");
        Punto3D[] puntos=new Punto3D[10];
        for(int i=0; i<10; i++){
            puntos[i]=new Punto3D(i, i*2, i*3);
        }
        double distanciaMenor=Double.MAX_VALUE;
        Punto3D punto1Menor=null;
        Punto3D punto2Menor=null;
        for(int i=0; i<puntos.length; i++){
            for(int j=i+1; j<puntos.length; j++){
                double distancia=puntos[i].distancia(puntos[j]);
                System.out.println("Distancia entre el punto "+(i+1)+" = ("+puntos[i].getX()+", "+puntos[i].getY()+", "+puntos[i].getZ()+") y el punto "+(j+1)+" = ("+puntos[j].getX()+", "+puntos[j].getY()+", "+puntos[j].getZ()+"): "+distancia);
                if(distancia<distanciaMenor){
                    distanciaMenor=distancia;
                    punto1Menor=puntos[i];
                    punto2Menor=puntos[j];
                }
            }
        }
        System.out.println("La menor distancia es: "+distanciaMenor);
        System.out.println("Punto A: ("+punto1Menor.getX()+", "+punto1Menor.getY()+", "+punto1Menor.getZ()+")");
        System.out.println("Punto B: ("+punto2Menor.getX()+", "+punto2Menor.getY()+", "+punto2Menor.getZ()+")");
    }
}
