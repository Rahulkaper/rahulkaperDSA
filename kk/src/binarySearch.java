public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,4,56,76,88,102,110};
        int target = 07;
        int ans = ceiling(arr, target);
//        System.out.println(ans);
        int target2 = 80;
        System.out.println(floor(arr,target2));
    }
    static int binaryS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/ 2;
            if(target>arr[mid]){
                start= mid+1;
            }
             else if(target<arr[mid]){
                end=mid-1;
            }
            else{
              return mid;
            }
        }
        return -1;
    }

//    order agnostic binary search;
    static int agnosticbinaryS(int[] arr, int target){
        int start =0;
        int end= arr.length-1;
        boolean IsAsc = arr[0]<arr[end];
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(IsAsc){
                if(target>arr[mid]){
                    start= mid+1;
                }
                else if (target<arr[mid]){
                    end=mid-1;
                }
                else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }
                    else if(target<arr[mid]){
                       start = mid+1;
                    }
            }
            }
        }
        return -1;
    }
    
    
    //ceiling of a number = The Smallest number greater than the target element;
    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/ 2;
            if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }

        }

        return start;
    }
    // floor = the greatest number smaller than the target element;
    static int floor(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }

        return end;
    }
    }


