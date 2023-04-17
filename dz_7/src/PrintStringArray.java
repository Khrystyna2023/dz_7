import java.util.ArrayList;
import java.util.*;
public class PrintStringArray {
    public void DisplayStringArray(){
        String str = "Khrystyna2023";
        char [] result = str.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);
    }
}
