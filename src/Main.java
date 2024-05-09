import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Controller cn = new Controller();
        int[] array1 = cn.createArray();
        int[] array2 = cn.createArray();

        System.out.println(Arrays.toString(array1));
        double firstAverageResult = cn.averageArray(array1);
        System.out.println("Среднее значение списка = " + firstAverageResult);

        System.out.println(Arrays.toString(array2));
        double secondAverageResult = cn.averageArray(array2);
        System.out.println("Среднее значение списка = " + secondAverageResult);

        cn.compareArray(firstAverageResult, secondAverageResult );
     }
}