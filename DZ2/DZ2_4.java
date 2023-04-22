package DZ2;

import java.util.Scanner;

public class DZ2_4 {
    public static void main(String[] args) throws Exception {
        try {
            noempty();
        } catch (emptyStringException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void noempty() throws Exception {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        if (inputString.length() == 0) {
            throw new emptyStringException();
        } else {
            System.out.println("Все ок!");
        }
        s.close();
    }
}