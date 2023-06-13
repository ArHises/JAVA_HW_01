import java.util.Arrays;
public class TaskFour {
    public static void main(String[] args) {
//        4.**
//        Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//        при этом метод должен сместить все элементы массива на n позиций.
//        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры:
//
//        [ 1, 2, 3 ]
//        при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//
//        [ 3, 5, 6, 1]
//        при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//
//        При каком n в какую сторону сдвиг можете выбирать сами.

        int[] arr = {1,2,3,4,5,6};
        System.out.print(Arrays.toString(arr));
        System.out.println("");

        System.out.print(Arrays.toString(moveArray(arr, 4)));
        System.out.println("");

    }
    public static int[] moveArray(int[] arr, int n) {

// [1, 2, 3, 4, 5] temp = 1 ;save = 3
//        ^
// [1, 2, 1, 4, 5] temp = 3 ;save = 5
//              ^
// [1, 2, 1, 4, 3] temp = 5 ;save = 2
//     ^
// [1, 5, 1, 4, 3] temp = 2 ;save = 4
//           ^
// [1, 5, 1, 2, 3] temp = 4 ;save = 1
//  ^
// [4, 5, 1, 2, 3] temp = 1 ;save = 1

// [4, 5, 1, 2, 3]

        int temp = arr[0];
        int save;
        int index = 0;

        if (n < 0) n = n + arr.length;

        if(arr.length % 2 != 0 || n == 1) {

            for (int i = 0; i < arr.length; i++) {

                if (index + n < arr.length) {
                    save = arr[index + n];
                    arr[index + n] = temp;
                    index += n;
                    temp = save;

                } else {
                    index = index - arr.length;
                    save = arr[index + n];
                    arr[index + n] = temp;
                    index += n;
                    temp = save;
                }
//                System.out.print(Arrays.toString(arr));
//                System.out.println("");
            }
        } else {
            for (int i = 0; i < arr.length + n - 2; i++) {

                if (index + n < arr.length) {
                    save = arr[index + n];
                    arr[index + n] = temp;
                    index += n;
                    temp = save;

                }
                else {
                    index = index - arr.length;
                    save = arr[index + n];
                    arr[index + n] = temp;
                    index += n - 1;
                    temp = save;
                }
                if(i == arr.length - 1){
                    index = index - arr.length;
                    save = arr[index + n];
                    arr[index + n] = temp;
                    index += n;
                    temp = save;
                }
//                System.out.print(Arrays.toString(arr));
//                System.out.println("");
            }
        }
        return arr;
    }

    public static int[] rotate(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // To handle cases where n is greater than the array length

        if (n < 0) {
            n += length; // n to be positive
        }

        reverse(arr, 0, length - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, length - 1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


