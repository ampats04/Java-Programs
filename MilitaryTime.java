import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
   
    public static String timeConversion(String s) {
    // Write your code here
   
    String[] parts = s.split(":");
    
    int hour = Integer.parseInt(parts[0]);
    int min = Integer.parseInt(parts[1]);
    int second = Integer.parseInt(parts[2].substring(0, 2));
    
    if(s.contains("PM") && hour!=12){
        hour+=12;
    }else if(s.contains("AM") && hour == 12){
        hour = 0;
    }
    
    String output = String.format("%02d:%02d:%02d",hour,min,second);
    
    return output;
  
   

    }

}

public class MilitaryTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
