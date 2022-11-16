import java.util.Arrays;

// 2. WAP to sort an array using Quick Sort Algorithm.

public class QuickSort2 {

	public static void main(String[] args) {
        int[] arr = {2,9,4,7,5,3,6,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        

    }
    static void quickSort(int[] nums, int low,int high){
        if (low>=high){
            return;
        }

        int s = low; //s=start index
        int e = high;// e = end index
        int m = s+(e-s)/2;// m = mid index
        int pivot = nums[m];

        while (s<=e){

//          a reason why if its already sorted it will not swap.
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }

//          now my pivot is at correct index, please sort two halves now
            quickSort(nums,low,e);
            quickSort(nums,s,high);
        }
    }
}
