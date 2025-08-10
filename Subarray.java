//Make sure to save the file name "Subarray.java" to run the code on VS code
public class Subarray{ 
    
    public static void printSubarrays(int numbers[]) {
        int ts = 0; // total subarrays counter
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print subarray
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println(); // new line after each subarray
            }
        }
        System.out.println();
        System.out.println("total subarrays = " + ts);
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
