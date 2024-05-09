public class Controller {
    private ArrList arrList;
    public  Controller() {
        this.arrList = new ArrList();
    }

    public int[] createArray() {
        return arrList.creteArray();
    }

    public void compareArray(double resultAverage1, double resultAverage2){
        arrList.compareArray(resultAverage1, resultAverage2);
    }

    public double averageArray(int[] array) {
        return arrList.averageArray(array);
    }
}
