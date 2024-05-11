public class Punto3D{
    private double x, y, z;
    public Punto3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Punto3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public Punto3D(Punto3D pto){
        this.x=pto.getX();
        this.y=pto.getY();
        this.z=pto.getZ();
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getZ(){
        return z;
    }
    public void setZ(double z){
        this.z=z;
    }
    public double distancia(Punto3D pto){
        double d=Math.sqrt(Math.pow(pto.getX()-this.x, 2)+Math.pow(pto.getY()-this.y, 2)+Math.pow(pto.getZ()-this.z, 2));
        return d;
    }
}
