
import java.util.Scanner;
// UVA 10019

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        int[] array = new int[cases];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        
        // Begin process
        for (int m = 0; m < array.length; m++) {
            int dec = array[m];
            String bin = Integer.toBinaryString(dec);
            int num_of_one = 0;
            for (int i = 0; i < bin.length(); i++) {
                if (bin.charAt(i) == '1') {
                    num_of_one +=1;
                }

            }
            System.out.print(num_of_one + " ");
            
            //Intepret as hex
            String temp = Integer.toString(dec);
            int hex = 0;
            int k = 0;
            for (int i = temp.length() - 1; i >= 0; i--) {
                int tem = Integer.parseInt(temp.substring(i, i + 1));
                hex += (tem * Math.pow(16, k));
                k++;

            }
            bin = Integer.toBinaryString(hex); // Convert to binary
            //Count number of 1 in the binary
            num_of_one = 0;
            for (int i = 0; i < bin.length(); i++) {
                if (bin.charAt(i) == '1') {
                    num_of_one +=1;
                }

            }
            System.out.println(num_of_one);

        }

    }

}
