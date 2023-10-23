package design5;


public abstract class PointCP5 {
    protected double xOrRho;
    protected double yOrTheta;
    public PointCP5(double xOrRho, double yOrTheta){
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
    }
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract String toString();
    public abstract PointCP5 convertStorageToCartesian();
    public abstract PointCP5 convertStorageToPolar();
    public abstract PointCP5 rotatePoint(double rotation);
    public abstract double getDistance(PointCP5 pointB);


    

}
