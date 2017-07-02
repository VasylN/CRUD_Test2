/**
 * Created by Pc on 02.07.2017.
 */
public class SortBubble {
    public static void main(String[] args) {
        int[] mas = {12, 34, 75, 2243, 4, 4};
        sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }

    public static void sort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }

            }
        }
    }
}
