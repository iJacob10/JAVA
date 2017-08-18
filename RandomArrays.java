import java.util.Random;
import java.util.Arrays;
public class RandomArrays {
	
	    public static void main( String args[] ) { 

	        Random random = new Random();

	        double[][] array = new double[5][3];

	        for( int i = 0 ; i < array.length ; i++ ) { 
	           for ( int j = 0 ; j < array[i].length ; j++ ) { 
	              array[i][j] = random.nextInt(101);
	           }
	        }

	        for( double[] a : array ) { 
	            System.out.println( Arrays.toString( a ));
	        }
	    }
	}

