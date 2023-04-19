package DZ2;

public class DZ2_2{
    public static void main (String[] args) throws Exception{
        int [] array = {1,2,3,4,8,9,9,0,0,9987,8};
        int d = 0;
        int index = 9;
        task2(d, array, index);
        
    }

 private static void task2(int d, int[] intArray, int index) throws Exception{
    try {
        
        
        double catchedRes1 = intArray[index] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (Exception e) {
        System.out.println("Catching exception: " + e.getMessage());
    }
}}
