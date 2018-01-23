package pkg2011_s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        char[] studentAnswers = new char[Integer.parseInt(reader.readLine())];
        int score = 0;
        
        for(int i = 0; i < studentAnswers.length; i++){
            studentAnswers[i] = reader.readLine().charAt(0);
        }
        
        for(int i = 0; i < studentAnswers.length; i++){
            if(studentAnswers[i] == reader.readLine().charAt(0)){
                score++;
            }
        }
        
        System.out.println(score);
        
    }
    
}
