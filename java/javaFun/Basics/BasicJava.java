import java.util.ArrayList;

public class BasicJava {
// 1- 255
//     public static void main(String[] args) {
//         for (int i = 1; i < 256; i++) {
//             System.out.println(i);
//         }
//     }

    // odd 1-255
    // public static void main(String[] args){
    //     for (int i = 1; i < 256; i++) {
    //         if (i % 2 == 1) {
    //             System.out.println(i);
    //         }
    //     }
    // }

    // 1-255 and sum
    // public static void main(String[] args) {
    //     int sum = 0;
    //     for (int i = 1; i < 256; i++) {
    //         System.out.println("New Number: " + i);
    //         System.out.println("Sum: " + (sum += i));
    //     }
    // }

    //Iterating through array
    // public static void main(String[] args) {
    //     int[] myArray = {1,3,5,7,9,13};
    //     for (int arr: myArray) {
    //         System.out.println(arr);
    //     }
    // }

    // public static void main(String[] arr) {
    //     int[] myArray = new int[]{-3, -5, -7};
    //     int maxNum = Integer.MIN_VALUE;
    //     for (int i = 0; i < myArray.length; i++){
    //         if (myArray[i] > maxNum){
    //             maxNum = myArray[i];
    //         }
    //     }
    //     System.out.println("The max number in this array is: " + maxNum);
    // }

    // public static void main(String[] args) {
    //     int[] myArray = {2,10,3};
    //     int sum = 0;
    //     double avg = 0;
    //     for (int i = 0; i < myArray.length; i++) {
    //         sum += myArray[i];
    //     }
    //     System.out.println("the average is: " + (double)sum / myArray.length);
    // }

    // public static void main(String[] args) {
    //     ArrayList<Integer> myArray = new ArrayList<>();
    //     for (int i = 1; i < 256; i++) {
    //         if (i % 2 == 1){
    //             myArray.add(i);
    //         }
    //     }
    //     System.out.println(myArray);
    // }

    // public static void main(String[] args) {
    //     int[] myArray = {1,3,5,7};
    //     int y = 3;
    //     int count = 0;
    //     for (int i = 0; i < myArray.length; i++){
    //         if (myArray[i] > y){
    //             count ++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    // public static void main(String[] args) {
    //     int[] myArray = {1,5,10,-2};
    //     int[] newArray = new int[myArray.length];
    //     int square;
    //     for (int i = 0; i < myArray.length; i++) {
    //         square = myArray[i] * myArray[i];
    //         newArray[i] = square;
    //     }
    //     System.out.println(Arrays.toString(newArray));
    // }

    // public static void noNegs (int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i] < 0) {
    //             arr[i] = 0;
    //         }
    //         System.out.println(arr[i] + ",");
    //     }
    // }
    // public static void main(String[] args) {
    //     noNegs(new int[] {1, 5, 10, -2});
    // }

    // public static void main(String[] args) {
    //     int[] myArray = {1,5,10,-2};
    //     int max = myArray[0];
    //     int min = myArray[0];
    //     int sum = 0;
    //     for (int i = 0; i < myArray.length; i++){
    //         if (myArray[i] > max){
    //             max = myArray[i];
    //         }
    //         if (myArray[i] < min){
    //             min = myArray[i];
    //         }
    //         sum += myArray[i];
    //     }

    //     System.out.println("Max value is: " + max);
    //     System.out.println("Min value is: " + min);
    //     System.out.println("The average is: " + (double)sum / myArray.length);
    // }

    static int[] get() {
        return new int[]{1,5,10,7,-2};
    }

    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList <>();
        int[] arr = get();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                newArray.add(0);
            } else {
                newArray.add(arr[i +1]);
            }
        }
        System.out.println(newArray + ",");
    }




}