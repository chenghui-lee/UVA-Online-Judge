import java.util.Scanner;
// UVA 11172
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[][] array = new int[num][2];
        for(int i=0;i<array.length;i++){
            array[i][0] = s.nextInt();
            array[i][1] = s.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if (array[i][0] == array[i][1]){
                System.out.println("=");
            }
            else if (array[i][0] > array[i][1]){
                System.out.println(">");
            }
            else if (array[i][0] < array[i][1]){
                System.out.println("<");
            }
            
        }
        
    }
    
}
