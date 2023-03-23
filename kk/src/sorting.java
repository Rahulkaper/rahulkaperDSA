import java.util.Arrays;

public class sorting {



        public static void main(String[] args) {
            int[] arr = {3,0,1};

            System.out.println(MissingNum(arr));
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
// cyclic sort

    static void cyclicsort(int[] arr){
           int i=0;
           while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
           }

        }

    }
 static int MissingNum(int[] arr){
            int i=0;
            while(i<arr.length){
                int correct = arr[i];
                if(arr[i]>arr.length-1){
                    i++;
                }
                if(arr[i]!=i){
                    swap(arr,i,correct);
                }
            }
            if(arr[i]!=i){
                return i;
            }
            return 0;
 }
}
