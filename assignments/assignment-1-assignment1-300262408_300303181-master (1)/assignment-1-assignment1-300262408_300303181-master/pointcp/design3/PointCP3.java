package design3;


import design2.PointCP2;
import design5.PointCP5;

public class PointCP3 extends PointCP5{
    private double x;
    private double y;
    

    public PointCP3(double x, double y){
      super(x, y);
    }
    public double getX(){
        return x;
    }
      public double getY(){
        return y;
    }
    public double getTheta(){
        return Math.toDegrees(Math.atan2(y, x));
    }
    public double getRho(){
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
     /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP5 pointB){
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double x = getX() - pointB.getX();
    double y = getY() - pointB.getY();
    return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
  }
    //does nothing
    public PointCP2 convertStorageToPolar()
  {
    double rho, theta = 0;
    //Calculate X and Y
    rho = getRho();
    theta = getTheta();
    return new PointCP2(rho, theta);
  }
  //does nothing
  public PointCP3 convertStorageToCartesian()
  {
    return this;
  }
   /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP3 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP3(
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString() {
		return "Stored as Cartesian  (" + getX() + "," + getY() + ")\n";
	}
}