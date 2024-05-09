import java.util.Random;

public class ArrList implements AverageValue, ComparableArray {
    private int[] arr;
    public ArrList() {
    }

    public int[] creteArray() {
        Random random = new Random();

        arr = random.ints(0, 100).distinct().limit(10).toArray();
//               = new int[sizeArr];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(0, 100 +1);
//        }
        return arr;
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double resultAverage = Math.round(sum / array.length);
        return resultAverage;
    }

    @Override
    public void compareArray(double firstAverageResult, double secondAverageResult) {
        if(firstAverageResult == secondAverageResult) {
            System.out.println("Средние значения равны");
        } else if (firstAverageResult > secondAverageResult) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }
}
