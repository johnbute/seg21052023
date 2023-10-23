package design2;

import design3.PointCP3;
import design5.PointCP5;

public class PointCP2 extends PointCP5{
    
    public PointCP2(double RHO, double theta){
        super(RHO, theta);
    }
    public double getX(){
        return (Math.cos(Math.toRadians(super.yOrTheta)) * super.xOrRho);
    }
    public double getY(){
        return (Math.sin(Math.toRadians(super.yOrTheta)) * super.xOrRho);
    }

    public double getRho(){
        return super.xOrRho;
    }
    public double getTheta(){
        return super.yOrTheta;
    }

    public PointCP5 convertStorageToPolar(){
        double Rho = getRho();
        double Theta = getTheta();
        PointCP5 point = new PointCP2(Rho, Theta);
        return point;
    }
    public PointCP5 convertStorageToCartesian(){
        double x = getX();
        double y = getY(); 

        PointCP5 point = new PointCP3(x,y);
        return point;
    }
    



    public double getDistance(PointCP5 pointB){
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double x = getX() - pointB.getX();
    double y = getY() - pointB.getY();
    return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
    double temp = (Math.cos(radRotation) * X)- (Math.sin(radRotation) * Y);
    Y = (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y);
    X = temp;
    double RHO = Math.sqrt(X*X+Y*Y);
    double theta = Math.atan2(Y,X);
    return new PointCP2(RHO, theta);
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as " + "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
  }
}
