package fr.insalyon.telecom.mgl;
import java.util.*;

public class RomanNumberConverter {

  public int convert(String romanNumber) {

    //Create hash map
    TreeMap roman = new TreeMap();
    int resultint = 0;

    //Set values
    roman.put("I", new int(1));
    roman.put("V", new int(5));
    roman.put("X", new int(10));
    roman.put("L", new int(50));
    roman.put("C", new int(100));
    roman.put("D", new int(500));
    roman.put("M", new int(1000));

    //Get a set of entries
    Set set = roman.entrySet();

    //Get an iterator
    Iterator i = set.iterator();

    for (int ii=0; ii<romanNumber.length; ii++) {
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         if ((me.getKey().compareTo(romanNumber[ii])) == 0) {
           resultint = resultint + me.getValue();
         }
       }
    }

    return resultint;

  }
}
