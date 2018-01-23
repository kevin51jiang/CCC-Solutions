
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin Jiang
 */
public class Main {
    
    public static boolean isOccupied(int m, int x, int y){
        final int fiveToM = (int) Math.pow(5, m - 1);
//        System.out.println("m: " + m + " x: " + x + " y: " + y);
        // if(    x < fiveToM||
           // x > 4 * fiveToM||
            // > Math.pow(5, 3)) {//weed out outer things

                // return false;
        // }else if(m == 1){
            // if(x != 1 && x != 3 && y != 1){
                // return true;
            // }else{
                // return false;
            // }
        // }else{
            // return isOccupied( m - 1, x % 5, y % 5);
        // }
		int x5 = x / 5, y5 = y / 5;
		
		if(x5 == 0 ||
		   x5 == 4 ||
		   y5 > 2  ||
		   (x5 == 1 && y5 == 1) ||//top left-ish part
		   (x5 == 3 && y5 == 1)){//top right-ish part
			return false;//the whitespace at the top, and non-contested areas
		}else if(m == 1){
			return true;//if magnification is 1, and is not in a whitespace area
		}
      
		return isOccupied(m - 1, x % Math.pow(5, m) / 5, y % Math.pow(5, m) / 5);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //mark out useless areas
        Scanner reader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int numCase = reader.nextInt();
        
        for(int i = 0; i < numCase; i++){
            if(isOccupied(reader.nextInt(),reader.nextInt(),reader.nextInt())){
				System.out.println("crystal");
            }else{
                System.out.println("empty");
            }
        
        }
//        isOccupied(3,44,9);
        
    }   
}
