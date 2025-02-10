package ARRAYS.DAY1;

 class MaxMin {
    static int getmax(int[] arr){
       int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
           if(arr[i] > max){
            max = arr[i];
           }
        }
        return max ;
    }
     public static void main(String[] args){
      int[] arr = {10, 20, 30, 40, 50};
      int max = getmax(arr);

      
      System.out.println("Maximum value: " + max);
      // System.out.println("Minimum value: " + min);
    }   
}
