import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLC {
    public static void main(String[] args) {
//        int[] arr = {0,2,1,5,3,4};
//        int[] ans = new int[arr.length-1];
//        System.out.println(Arrays.toString(BuildArray(arr)));
//       int[] candies = {2,3,5,1,3,};
//        int extraCandies = 3;
//        List<Boolean> ans= kidsWithCandies(candies, extraCandies);
//        System.out.println(ans);
//        for(int elements:candies){
//            System.out.println(elements);
        String name= "sdjfhesidhaosd";
        char[] arr = new char[name.length()];
        for (int i=0;i<name.length(); i++){
            arr[i]= name.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

//        }
    }


    // permutation build array leetcode (easy) ;
    static int[] BuildArray(int[] num){
        int[] ans = new int[num.length];

        for (int i=0; i<num.length; i++){
            ans[i]=num[num[i]];
        }
        return ans ;
    }


 static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     boolean arr[] = new boolean[candies.length];
     int big = biggest(candies);
     int ans = 0;
     ArrayList<Boolean> mylist = new ArrayList<>(arr.length);
     for (int i = 0; i < candies.length; i++) {
         ans = candies[i] + extraCandies;
         if (ans >= big) {
             mylist.add(true);
         }
         else{
             mylist.add(false);
         }



     }


     return mylist;

 }

    static int biggest(int[]arr){
        int biggest=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>biggest){
                biggest=arr[i];
            }

        }
        return biggest;

    }
}

