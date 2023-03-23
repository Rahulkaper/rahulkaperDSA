import java.util.Scanner;

public class functions {


    public static void main(String[] args) {
//        three digit armstrong number;
        for (int i=100; i<1000; i++){
            if (checkArmstrong(i)) {
                System.out.print(i+ " ");
            }
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int x = sc.nextInt();

//        System.out.println(checkArmstrong());
//        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
        //applying switch statements
//        switch (fruit) {
//            case "apple" -> System.out.println("apple is a red fruit");
//            case "mango" -> System.out.println("mango is my favrouite fruit");
//            case "grapes" -> System.out.println("grapes are small");
//            default -> System.out.println("enter a valid fruit");
//        }
        System.out.println(checkArmstrong(153));
    }

    // checking if the number is armstrong or not;

    static boolean checkArmstrong(int n) {
        int original = n;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans + (rem * rem * rem);
            n = n / 10;
        }
        if (original == ans) {
            return true;
        }
        return false;
    }
}
//    all the three digits armstrong number;










