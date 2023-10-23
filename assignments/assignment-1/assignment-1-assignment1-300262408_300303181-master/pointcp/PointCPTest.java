// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/


import java.util.Random;

import design2.PointCP2;
import design3.PointCP3;
import design5.PointCP5;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest
{
  //Class methods *****************************************************

  /*
  private static PointCP getInput() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    //Information to be passed to the constructor
    char coordType = 'A'; // Temporary default, to be set to P or C
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 3; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
        // Prompt the user
        if (i == 0) // First argument - type of coordinates
        {
          System.out.print("Enter the type of Coordinates you "
            + "are inputting ((C)artesian / (P)olar): ");
        }
        else // Second and third arguments
        {
          System.out.print("Enter the value of " 
            + (coordType == 'C' 
              ? (i == 1 ? "X " : "Y ")
              : (i == 1 ? "Rho " : "Theta ")) 
            + "using a decimal point(.): ");
        }

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
             
        System.in.read(buffer);
        theInput = new String(buffer).trim();
        
        // Verify the user's input
        try
        {
          if (i == 0) // First argument -- type of coordinates
          {
            if (!((theInput.toUpperCase().charAt(0) == 'C') 
              || (theInput.toUpperCase().charAt(0) == 'P')))
            {
              //Invalid input, reset flag so user is prompted again
              isOK = false;
            }
            else
            {
              coordType = theInput.toUpperCase().charAt(0);
            }
          }
          else  // Second and third arguments
          {
            //Convert the input to double values
            if (i == 1)
              a = Double.valueOf(theInput).doubleValue();
            else
              b = Double.valueOf(theInput).doubleValue();
          }
        }
        catch(Exception e)
        {
        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
    //Return a new PointCP object
    return (new PointCP(coordType, a, b));*/
    // initiate random integer for timer
		public static void main(String[] args) {

		// initiate random integer for timer
		int myRandomInt = 1500000;

		Random r = new Random();
		//Test time for design 1 and design 5 instatiation
		
		char c = r.nextBoolean() ? 'C' : 'P';
		long startTimeinit1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
		}
		long timeElapsedinit1 = (System.nanoTime() - startTimeinit1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of instantiating design1: " + timeElapsedinit1+ " millis seconds\n");
		

		long startTimeinit2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
		}
		long timeElapsedinit2 = (System.nanoTime() - startTimeinit2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of instantiating design2: " + timeElapsedinit2+ " millis seconds\n");

		long startTimeinit3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
		}
		long timeElapsedinit3 = (System.nanoTime() - startTimeinit3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of instantiating design3: " + timeElapsedinit3+ " millis seconds\n");


		long startTimeinit5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
		}
		long timeElapsedinit5 = (System.nanoTime() - startTimeinit5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of instantiating design5: " + timeElapsedinit5+ " millis seconds\n");

		
		//Test time for design 1 and design 5 getX()
		
		long startTimegetX1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.getX();
		}
		long timeElapsedTimegetX1 = (System.nanoTime() - startTimegetX1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getX() design1: " + timeElapsedTimegetX1+ " millis seconds\n");


		long startTimegetX2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.getX();
		}
		long timeElapsedgetX2 = (System.nanoTime() - startTimegetX2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getX() design2: " + timeElapsedgetX2+ " millis seconds\n");

		long startTimegetX3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getX();
		}
		long timeElapsedgetX3 = (System.nanoTime() - startTimegetX3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getX() design3: " + timeElapsedgetX3+ " millis seconds\n");


		long startTimegetX5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getX();
		}
		long timeElapsedgetX5 = (System.nanoTime() - startTimegetX5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getX() design5: " + timeElapsedgetX5+ " millis seconds\n");


		//tEST TIME FOR DESIGN 1 AND DESIGN 5 getY()

		long startTimegetY1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.getY();
		}
		long timeElapsedTimegetY1 = (System.nanoTime() - startTimegetY1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getY() design1: " + timeElapsedTimegetY1+ " millis seconds\n");

		long startTimegetY2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.getY();
		}
		long timeElapsedgetY2 = (System.nanoTime() - startTimegetY2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getY() design2: " + timeElapsedgetY2+ " millis seconds\n");

		long startTimegetY3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getY();
		}
		long timeElapsedgetY3 = (System.nanoTime() - startTimegetY3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getY() design3: " + timeElapsedgetY3+ " millis seconds\n");


		long startTimegetY5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getY();
		}
		long timeElapsedgetY5 = (System.nanoTime() - startTimegetY5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getY() design5: " + timeElapsedgetY5+ " millis seconds\n");


		//Test time for design 1 and design 5 getRho()

		long startTimegetRho1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.getRho();
		}
		long timeElapsedTimegetRho1 = (System.nanoTime() - startTimegetRho1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getRho() design1: " + timeElapsedTimegetRho1+ " millis seconds\n");


		long startTimegetRho2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.getRho();
		}
		long timeElapsedgetRho2 = (System.nanoTime() - startTimegetRho2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getRho() design2: " + timeElapsedgetRho2+ " millis seconds\n");

		long startTimegetRho3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getRho();
		}
		long timeElapsedgetRho3 = (System.nanoTime() - startTimegetRho3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getRho() design3: " + timeElapsedgetRho3+ " millis seconds\n");


		long startTimegetRho5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getRho();
		}
		long timeElapsedgetRho5 = (System.nanoTime() - startTimegetRho5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getRho() design5: " + timeElapsedgetRho5+ " millis seconds\n");

		//Test design 1 and 5 getTheta()
		long startTimegetTheta1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.getTheta();
		}
		long timeElapsedTimegetTheta1 = (System.nanoTime() - startTimegetTheta1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getTheta() design1: " + timeElapsedTimegetTheta1+ " millis seconds\n");

		long startTimegetTheta2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.getTheta();
		}
		long timeElapsedgetTheta2 = (System.nanoTime() - startTimegetTheta2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getTheta() design2: " + timeElapsedgetTheta2+ " millis seconds\n");

		long startTimegetTheta3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getTheta();
		}
		long timeElapsedgetTheta3 = (System.nanoTime() - startTimegetTheta3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getTheta() design3: " + timeElapsedgetTheta3+ " millis seconds\n");

		long startTimegetTheta5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getTheta();
		}
		long timeElapsedgetTheta5 = (System.nanoTime() - startTimegetTheta5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getTheta() design5: " + timeElapsedgetTheta5+ " millis seconds\n");

		//test design 1 and 5 for convert Storage to Cartesian

		long startTimegetsC1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.convertStorageToCartesian();
		}
		long timeElapsedTimegetsC1 = (System.nanoTime() - startTimegetsC1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to cartesian design1: " + timeElapsedTimegetsC1+ " millis seconds\n");

		long startTimegetsC2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.convertStorageToCartesian();
		}
		long timeElapsedgetsC2 = (System.nanoTime() - startTimegetsC2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to cartesian design2: " + timeElapsedgetsC2+ " millis seconds\n");

		long startTimegetsC3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.convertStorageToCartesian();
		}
		long timeElapsedgetsC3 = (System.nanoTime() - startTimegetsC3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to cartesian design3: " + timeElapsedgetsC3+ " millis seconds\n");


		long startTimegetsC5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.convertStorageToCartesian();
		}
		long timeElapsedgetsC5 = (System.nanoTime() - startTimegetsC5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to cartesian design5: " + timeElapsedgetsC5+ " millis seconds\n");

		//Test design 1 and 5 for convert Storage to Polar

		long startTimegetsP1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.convertStorageToPolar();
		}
		long timeElapsedTimegetsP1 = (System.nanoTime() - startTimegetsP1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to polar design1: " + timeElapsedTimegetsP1+ " millis seconds\n");


		long startTimegetsP2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.convertStorageToPolar();
		}
		long timeElapsedgetsP2 = (System.nanoTime() - startTimegetsP2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to polar design2: " + timeElapsedgetsP2+ " millis seconds\n");

		long startTimegetsP3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.convertStorageToPolar();
		}
		long timeElapsedgetsP3 = (System.nanoTime() - startTimegetsP3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to polar design3: " + timeElapsedgetsP3+ " millis seconds\n");


		long startTimegetsP5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.convertStorageToPolar();
		}
		long timeElapsedgetsP5 = (System.nanoTime() - startTimegetsP5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of converting storage to polar design5: " + timeElapsedgetsP5+ " millis seconds\n");

		//test design 1 and 5 for rotatePoint
		long startTimegetr1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.rotatePoint(r.nextDouble());
		}
		long timeElapsedTimegetr1 = (System.nanoTime() - startTimegetr1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of rotatePoint() design1: " + timeElapsedTimegetr1+ " millis seconds\n");

		long startTimegetr2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.rotatePoint(r.nextDouble());
		}
		long timeElapsedgetr2 = (System.nanoTime() - startTimegetr2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of rotatePoint() design2: " + timeElapsedgetr2+ " millis seconds\n");

		
		long startTimegetr3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.rotatePoint(r.nextDouble());
		}
		long timeElapsedgetr3 = (System.nanoTime() - startTimegetr3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of rotatePoint() design3: " + timeElapsedgetr3+ " millis seconds\n");


		long startTimegetr5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.rotatePoint(r.nextDouble());
		}
		long timeElapsedgetr5 = (System.nanoTime() - startTimegetr5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of rotatePoint() design5: " + timeElapsedgetr5+ " millis seconds\n");

		//Test design 1 and 5 for getDistance
		long startTimegetd1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			point.getDistance(new PointCP(c, r.nextDouble(), r.nextDouble()));
		}
		long timeElapsedTimegetd1 = (System.nanoTime() - startTimegetd1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getDistance() design1: " + timeElapsedTimegetd1+ " millis seconds\n");

		long startTimegetd2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			cp.getDistance(new PointCP2(r.nextDouble(), r.nextDouble()));
		}
		long timeElapsedgetd2 = (System.nanoTime() - startTimegetd2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getDistance design2: " + timeElapsedgetd2+ " millis seconds\n");
		
		long startTimegetd3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getDistance(new PointCP3(r.nextDouble(), r.nextDouble()));
		}
		long timeElapsedgetd3 = (System.nanoTime() - startTimegetd3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getDistance design3: " + timeElapsedgetd3+ " millis seconds\n");
		

		long startTimegetd5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			cp.getDistance(new PointCP2(r.nextDouble(), r.nextDouble()));
		}
		long timeElapsedgetd5 = (System.nanoTime() - startTimegetd5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of getDistance design5: " + timeElapsedgetd5+ " millis seconds\n");
		
		//Test design 1 and 5 for toString
		long startTimegets1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP(c, r.nextDouble(), r.nextDouble());
			String s = point.toString();
		}
		long timeElapsedTimegets1 = (System.nanoTime() - startTimegets1)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of toString() design1: " + timeElapsedTimegets1+ " millis seconds\n");

		long startTimegets2 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP2 cp = new PointCP2(r.nextDouble(), r.nextDouble());
			String S = cp.toString();
		}
		long timeElapsedgets2 = (System.nanoTime() - startTimegets2)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of toString() design2: " + timeElapsedgets2+ " millis seconds\n");
		
		long startTimegets3 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP3 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			String S = cp.toString();
		}
		long timeElapsedgets3 = (System.nanoTime() - startTimegets3)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of toString() design3: " + timeElapsedgets3+ " millis seconds\n");

		long startTimegets5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(r.nextDouble(), r.nextDouble());
			String S = cp.toString();
		}
		long timeElapsedgets5 = (System.nanoTime() - startTimegets5)/1000000;
		System.out.println("time tooked to excute " + myRandomInt + " times of toString() design5: " + timeElapsedgets5+ " millis seconds\n");

		// 
		// clock the time taken for design 1 coordinate conversion
		long startTime1 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP point = new PointCP('C', 4.2 , 3.9);
			point.getX();
			point.getY();
			point.getRho();
			point.getTheta();
			point.convertStorageToCartesian();
			 //System.out.println("\nAfter asking to store as Cartesian:\n" + point);
			point.convertStorageToPolar();

			// System.out.println("\nAfter asking to store as Polar:\n" + point);
		}
		
		long timeElapsedDesign1 = (System.nanoTime()-startTime1)/1000000;
		System.out.print("time tooked to excute " + myRandomInt + " times of design1: " + timeElapsedDesign1
				+ " millis seconds\n");

		
		
		// clock the time taken for design 5 coordinate conversion
		long startTime5 = System.nanoTime();
		for (int i = 0; i < myRandomInt; i++) {
			PointCP5 cp = new PointCP3(4.2, 3.9);//new c
			cp.getX();
			cp.getY();
			cp.getRho();
			cp.getTheta();
			PointCP5 cp2 = cp.convertStorageToPolar();// return new cp2/P
			PointCP5 cp3 = cp.convertStorageToCartesian();//return cp3/C
			
			 
		}
		
		long timeElapsedDesign5 = (System.nanoTime()- startTime5)/1000000;
		System.out.print("time tooked to excute " + myRandomInt + " times of design5: " + timeElapsedDesign5
				+ " millis seconds\n");

	}
}

