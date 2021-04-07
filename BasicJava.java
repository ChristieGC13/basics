import java.util.ArrayList;

public class BasicJava {
    public void printTo255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOddsTo255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println("Number: "+ i + " Sum: " + sum);
        }
    }

    public void printArrVals(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void getAvg(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }

    public void oddArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public void squareVals(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            temp.add(arr[i]* arr[i]);
        }
        System.out.println(temp);
    }

    public void noNeg(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 ) {
                temp.add(0);
            } else {
                temp.add(arr[i]);
            }
        }
        System.out.println(temp);
    }

    public void maxMinAvg(int[] arr) {
        int sum = arr[0];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]){
                min = arr[i];
            }
        }
        int avg = sum / arr.length;
        System.out.println("MAXNUM: " + max + ", MINNUM: " + min + ", AVG: " + avg);
    }

    public void shiftVals(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            temp.add(arr[i]);
        }
        temp.add(0);
        System.out.println(temp);
    }

}