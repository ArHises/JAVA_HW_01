import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
//        2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//        Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        int[] matrix[] = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }
        // print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
