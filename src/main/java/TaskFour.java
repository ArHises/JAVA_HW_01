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

        int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(arr));
        System.out.println("");

        arr = moveArray(arr, 2);
        System.out.print(Arrays.toString(arr));
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
        }
        return arr;
    }


}
