import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,5,7};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
      int[] arr1 = {1,2,3,0,0,0};
      int [] arr2 = {2,5,6};
      int m=3;
      int n=3;
//        System.out.println(Arrays.toString(merge(arr1,arr2,m,n)));
 int [] majority ={6,53,53,96,45,79,53,58,53,90,40,53,53,1,53,53,89,53,33,27,53,53,84,42,53,53,87,51,66,53,28,53,53,53,50,39,36,48,19,74,38,53,42,53,99,53,80,53,53,53,53,96,78,52,24,53,53,53,53,64,10,53,53,53,53,82,53,53,53,22,53,53,67,53,53,53,53,53,67,53,19,99,53,53,21,53,69,53,53,53,52,53,96,53,53,51,81,62,4,6};
        BubbleSort(majority);
      System.out.println(Arrays.toString(majority));
        System.out.println(majorityElement(majority));
//        System.out.println(majority.length);


    }
    // selection sort;
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            //checking the greateset element and swapping it with the last one
            int last = arr.length-i-1;
            int max = getmax(arr,0, last);
            swap(arr,max,last);
        }

    }

    static void swap(int[] arr, int first, int second){
         int temp = arr[first];
         arr[first]=arr[second];
         arr[second]=temp;

    }

    static int getmax(int[] arr, int first, int last){
        int max = first;
        for(int i =first; i<=last; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }


    //bubble sort
    static void BubbleSort(int [] arr){
        boolean swapped;
        // we create a boolean so that we can minimize the comparissions when the array is already sorted ;
        for(int i=0; i<arr.length; i++){
            swapped=false;
            for (int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;

                }
            }
            if(swapped == false){
                // if swapped doesn't oocur in the first case that means the array is sorted and we don't need perform the rest of the comparrisons ;
                break;
            }
        }
    }

    //merging of arrays;

    static int[] merge(int[] nums1, int[] nums2, int m, int n){
        for(int i=m; i<nums1.length;){
           int j=0;
           while(j<nums2.length){
               nums1[i]=nums2[j];
               i++;
               j++;
           }
        }
            return nums1;
        }


        // majority elementy\
        static int majorityElement(int[] nums) {
            int x=0;
            for(int i=0; i<nums.length; ){
                int majority =nums[i];
                for(int j=0; j<nums.length; j++){
                    if(majority==nums[j]){
                        x++;
                        if(x>nums.length/2){
                            return majority;
                        }
                        else{
                            i++;
                        }
                    }

                }


            }
            return -1;

        }


}
