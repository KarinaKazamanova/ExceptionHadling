/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

package DZ2;

import java.util.Scanner;

public class DZ2_1{
    public static void main (String[] args){
        float number = justfloattype();
        System.out.println(number);  
    }
        public static float justfloattype() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число типа float");
        float input = 0;
        boolean flag = true;
        while(flag){
        try{
            input = Float.parseFloat(scan.nextLine());
            flag = false;
            scan.close();
        } catch (Exception e){
            System.out.println("Некорректный тип данных");
            continue;
        }
    }return input;
    
    }

}
