package Prefinalwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class main {
    public static void main (String[] args) throws ParseException{
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String [] list = s.split(" ");
    ArrayList <String> data = new ArrayList<String>();
    for (String input_data : list){
        data.add(input_data);

    }
    Collections.sort(data);
    for(String out : data){
        System.out.println(out);
    }

    // SimpleDateFormat format = new SimpleDateFormat();
    // format.applyPattern("dd.MM.yyyy");
    // Date docDate = format.parse(s);
    // System.out.println(s);
    // }

}
}