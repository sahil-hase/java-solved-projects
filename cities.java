package slip3;

import java.util.*;

public class cities {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of cities :");
        int n = sc.nextInt();
        String[] city = new String[n];
        String temp;
        for (int i = 0; i < n; i++) {
            city[i] = sc.next();
        }
        Arrays.sort(city);
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n - i - 1; j++) {
//                if (city[j].compareTo(city[j + 1]) > 0) {
//                    temp = city[j];
//                    city[j] = city[j + 1];
//                    city[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("The sorted list is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(city[i]);
        }
    }
}