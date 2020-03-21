public class Main {
    public static void main(String[] args) {
        int[] arrayFirst=new int[CombineArray.enterSizeArray()];
        CombineArray.enterValueToArray(arrayFirst);
        CombineArray.displayArray(arrayFirst,"first");

        int[] arraySecond=new int[CombineArray.enterSizeArray()];
        CombineArray.enterValueToArray(arraySecond);
        CombineArray.displayArray(arraySecond,"second");

        int[] arrayThird=CombineArray.combineArray(arrayFirst, arraySecond);
        CombineArray.displayArray(arrayThird, "third");
    }
}
