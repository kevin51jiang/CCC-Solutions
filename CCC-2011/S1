package pkg2011_s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin Jiang
 */
public class Main {

    public static void doStuff() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numS = 0, numT = 0, temp;
        while((temp = reader.read()) != -1){
            if(temp == 's' || temp == 'S'){
                numS++;
            }else if(temp == 't' || temp == 'T'){
                numT++;
            }
        }
        
        
        
        if(numT > numS){
            System.out.println("English");
        }else{
            System.out.println("French");
        }
        
        reader.close();
        
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        doStuff();
    }
    
}
