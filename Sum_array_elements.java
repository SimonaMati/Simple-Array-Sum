import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result1 {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        
        for(int i = 0; i < ar.size(); i++){
            sum += ar.get(i);
        }
        return sum;
    }
}

public class Sum_array_elements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        System.out.print("Enter the length of your array >> ");
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.print("Enter all elements of your array >> ");
        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result1.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

