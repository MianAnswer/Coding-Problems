class solutionProblem126 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        
        System.out.println("****************\n\n" + (array.length) % 3);
        for (int num : array) {
          System.out.print(num + " ");
        }  
        System.out.println();
        rotateArray(6, array);
      }
    
      private static void rotateArray(int rotateNumber, int[] arr) {
         int leftSide = 0;
         int rightSide = rotateNumber;
         int length = ((arr.length / 2 == rotateNumber) && arr.length % 2 == 0)? rotateNumber + 1: arr.length;
    
         for (; leftSide < length; ++leftSide) {
           if (rightSide > arr.length - 1) {
             if (leftSide >= rotateNumber) {
               if (arr.length % 2 != 0) {
                  rightSide = length - 1;
               } else {
                 rightSide = leftSide;
               }
             } else {
               rightSide = rotateNumber;
             }
           }
           swap(arr, leftSide, rightSide);
           rightSide++;
           for (int num : arr) {
          System.out.print(num + " ");
        }  System.out.println();
         } 
      }
    
      private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
}