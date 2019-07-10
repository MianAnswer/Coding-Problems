import java.util.Arrays;

class solutionProblem2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] productArray = productArray(arr);
        System.out.println("Problem #2");
        System.out.println(Arrays.toString(productArray));
    }

    public static int[] productArray(int[] arr) {
        int lengthOriginal = arr.length;
        int[] newArray = new int[lengthOriginal];
        int lengthNew = newArray.length;
        int totalProduct = 1;

        for(int i = 0; i < lengthOriginal; ++i) {
            totalProduct *= arr[i];
        }

        for(int j = 0; j < lengthNew; ++j) {
            newArray[j] = totalProduct / arr[j];
        }

        return newArray;
    }
}