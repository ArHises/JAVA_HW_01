
import java.util.Random;
import java.util.Arrays;
public class TaskOne {
    public static void main(String[] args) {
        // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        int[] arr = createRandomArr(10);
        System.out.print(Arrays.toString(arr));
        System.out.println("");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }
    public static int[] createRandomArr(int len){
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(-10, 10);
        }
        return array;
    }
}
