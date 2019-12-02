package lab6.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> strings = new HashMap<Integer, String>();

        strings.put(1,"one");
        strings.put(2,"two");
        strings.put(5,"five");
        strings.put(9,"nine");

        System.out.println("6th Key has the following value: "+ strings.get(5));


        for(Map.Entry e: strings.entrySet()){
            System.out.println(("key = "+e.getKey()+ " value = " +e.getValue()));

        }
    }
}
