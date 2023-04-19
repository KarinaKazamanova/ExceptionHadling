package DZ2;


public class DZ2_3{


    public static void main (String[] args) throws Exception{
        
        try {
            int a = 1;
            String b = "1";
            
            System.out.println((Integer) (Object) a / (Integer) (Object) b);
            printSum(0, 1);
            int[] abc = null;
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего сознания!");
        
        
        } catch (NumberFormatException ex){
            System.out.println("Неверный формат входных данных"); 
        } 
        /* Не получилось обработать ошибку ввода в printSum неверного количества аргументов. Такое не обрабатывается? */
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     


    }
   
    public static void printSum(Object a, Object b) throws Exception {
        try{ int a_1 = (Integer) a;
            int b_1 = (Integer) b;

            System.out.println(a_1 + b_1);
        } catch(Exception e){
         throw new RuntimeException();
        }
        
     }
     
     
}