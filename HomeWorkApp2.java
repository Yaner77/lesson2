package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(5, 10));
        isPositiveOrNegative (0);
        System.out.println(isNegative (100));
        printWordNTimes (5);
        System.out.println(leapYear(2000));
    }

    public static boolean within10and20 ( int a, int b){
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if(a>0) {
            return false;
        } else {
            return true;
        }
    }
    public static void printWordNTimes(int i) {

        for (i = 0; i < 5; i++) {
            System.out.println("number"+i);
        }
        System.out.println("END");
    }

    public static boolean leapYear (int x) {

        if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }


}






