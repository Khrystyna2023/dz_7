import java.util.ArrayList;
import java.util.*;
public class ArrayEvenSumElements {
    public void MyArraywork() {
            int sum = 0;
            int [] ArrayAddEvenSum = new int[6];
            System.out.println("Random elements in array: ");
            for (int j = 0; j < ArrayAddEvenSum.length; j++) {
                ArrayAddEvenSum[j] = (int) ((Math.random()*40) + 1);  //рандомна генерація чисел для масива в діапазаоні від 0 до 41
                System.out.print(ArrayAddEvenSum[j] + " ");
            }
            for(int element : ArrayAddEvenSum) {
                if (element % 2 == 0) {
                    sum += element;
                }
            }
            System.out.println('\n' + "Sum = " + sum);
        }
        }

