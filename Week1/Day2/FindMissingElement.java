package week1.day2;

public class FindMissingElement {
	static int[]arr={1,4,3,2,8,6,7};
    static int n = arr.length;
       public static void findMissing(int arr[], int N)
   {
       int i;
       int temp[] = new int[N + 1];
       for (i = 0; i <= N; i++) {
           temp[i] = 0;
       }
       for (i = 0; i < N; i++) {
           temp[arr[i] - 1] = 1;
       }
       int missingnum = 0;
       for (i = 0; i <= N; i++) {
           if (temp[i] == 0)
               missingnum = i + 1;
       }
       System.out.println("The missing element in the given array is: "+missingnum);
   }
   public static void main(String[] args) {
       findMissing(arr, n);
   }
}
