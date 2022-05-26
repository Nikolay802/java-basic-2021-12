package OtusSort;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {

        Date date = new Date();

        int[] array = {9, 3, 1, 5, 7, 8, 9, 10, 15, 14, 13, 12, 16, 18, 152, 23, 4, 5, 1, 34, 5, 6};

        System.out.println("Исходный массив" + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
             for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = j;

                    int temp = array[min];
                    array[min] = array[i];
                    array[i] = temp;
                }
            }
        }
        Date newDate = new Date();

        double time = newDate.getTime() - date.getTime();

        System.out.println("Отсортированный массив" + Arrays.toString(array));
        System.out.println(time);

        List<Integer> sortList = Arrays.asList(9, 3, 1, 5, 7, 8, 9, 10, 15, 14, 13, 12, 16, 18, 152, 23, 4, 5, 1, 34, 5, 6);
        Date date1 = new Date();
        Collections.sort(sortList);
        Date newDate1 = new Date();
        double time1 = newDate1.getTime() - date1.getTime();

        System.out.println(sortList);
        System.out.println(time1);
    }
}