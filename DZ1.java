
public class DZ1{

public static void main(String[] args){
    double[] massive = new double[] {1, 21,7};
        double[] massive1 = new double[] {1, 21,-2};
        double[] newmassive = Devision(massive, massive1);
         
        for(int i = 0; i < newmassive.length; i ++){
        System.out.println(newmassive[i]);
        }
}

public static int[] Deduction(int[] ar1, int[] ar2){
    if (ar1.length != ar2.length){
        throw new RuntimeException("Массивы разной длины");
    }
    
    int[] result = new int[ar1.length];
    for(int i = 0; i < ar1.length; i++){
        result[i] = ar1[i] - ar2[i];
    }
    return result;
}
private static double[] Devision(double[] ar1, double[] ar2){
    if (ar1.length != ar2.length){
        throw new RuntimeException("Массивы разной длины");
    }
    for(int i = 0; i < ar2.length; i++){
        if (ar2[i] == 0){
        throw new RuntimeException("Во втором массиве есть 0. На 0 делить нельзя");
    }
}
    double[] result = new double[ar1.length];
    for(int i = 0; i < ar1.length; i++){
        result[i] = ar1[i] / ar2[i];
    }
    return result;
}

}
