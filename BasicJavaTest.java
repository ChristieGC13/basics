public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava b = new BasicJava();
        b.printTo255();
        b.printOddsTo255();
        b.printSum();

        int[] thisArr = {-1,3,5,7,-9,13};
        b.printArrVals(thisArr);
        b.findMax(thisArr);
        b.getAvg(thisArr);
        b.oddArr();
        b.greaterThanY(thisArr,4);
        b.squareVals(thisArr);
        b.noNeg(thisArr);
        b.maxMinAvg(thisArr);
        b.shiftVals(thisArr);

    }
}