package day17foreachloopmultidimensionalarray;
public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        
        // Print the elements which have "a" from a 2 dimensional string array
        
        String arr1[][] = { { "learn", "java", "it"}, {"is", "easy"} };
        
        for (String [] w : arr1) {
            
            for( String x : w) {
                
                if(x.contains("a")) {
                    System.out.println(x + " ");
                    
                }
            }
        }
        
        
        //Convert a 2 dimensional array to 1 dimensional array
        
        int arr2 [][] = { {1,2}, {3,4,5}, {6,7,8,9,10} };
        
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        
        
        
    }
}