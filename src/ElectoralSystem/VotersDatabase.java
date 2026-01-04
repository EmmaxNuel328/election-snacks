package ElectoralSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class VotersDatabase {
    private int keyCount;
    private int valueCount;
    private int count;
    private int counter;
    private boolean isEmpty;
    private static String[] keys = new String[2];
    private static String[][] values = new String[2][4];



    public boolean isEmpty(){
       if(keyCount==0 || valueCount==0){
           isEmpty = true;
       }
        return isEmpty;
    }



    public void add(String key, String[] value) {
        keys[keyCount++] = key;
        values[valueCount++] = value;

    }

    public String[] getValues(String key) {
        return values[count++];
    }


}
