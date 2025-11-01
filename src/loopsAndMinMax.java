import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class loopsAndMinMax {
    public void main(String[] args) {
        int fabionacciNumber = 10;

        int first = 0;
        int second = 1;
        System.out.println("Fabionacci Series");
        for (int i = 0; i < fabionacciNumber; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }


        System.out.println("min-max");
        int[] numbers = {1, 3, 4, 2, 3, 4};
        int min= numbers[0];
        int max= numbers[0];

        for(int j=1; j<numbers.length; j++){
            min= min(min,numbers[j]);
            max=max(max,numbers[j]);
        }

        System.out.println("MIN: "+ min + " , max : " + max);
    }

}
