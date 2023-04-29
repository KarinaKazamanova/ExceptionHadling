package Prefinalwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class isInteger {
    public boolean isInteger(String input) {

        try {
            Long number = Long.parseLong(input);

            return true;
        } catch (Exception e) {
            return false;

        }

    }

}
