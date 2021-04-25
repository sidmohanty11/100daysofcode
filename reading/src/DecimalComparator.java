public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        int a = (int)(firstValue * 1000);
        int b = (int)(secondValue*1000);
        if (a==b){
            return true;
        }
        return false;
    }
}
