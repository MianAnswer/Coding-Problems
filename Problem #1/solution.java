class solution {
    public static void main(String[] args) {
       System.out.println("Problem #1");
       int[] arr = {10, 15, 3, 7};
       System.out.println(isSumEqualToResult(arr, 18));
    }

    private static boolean isSumEqualToResult(int[] arr, int k) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if(arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + k);
                    return true;
                }
            }
        }
        return false;
    }
}
