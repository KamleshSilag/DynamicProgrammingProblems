/*
Problem : Ugly Number
Author : Kamlesh Silag
 */

import java.util.Scanner;
public class UglyNumber {
    public static int getUglyNumber(int n){
        int ugly[] = new int[n];
        int i2 = 0 , i3 = 0 , i5 = 0;
        int nextMultiply_2 = 2 , nextMultiply_3 = 3 , nextMultiply_5 = 5;
        ugly[0] = 1;
        int next_ugly = 1;

        for(int i=1;i<n;i++){
            next_ugly = Math.min(nextMultiply_2,Math.min(nextMultiply_3,nextMultiply_5));
            ugly[i] = next_ugly;

            if(next_ugly == nextMultiply_2){
                i2++;
                nextMultiply_2 = ugly[i2]*2;
            }
            if(next_ugly == nextMultiply_3){
                i3++;
                nextMultiply_3 = ugly[i3]*3;
            }
            if(next_ugly == nextMultiply_5){
                i5++;
                nextMultiply_5 = ugly[i5]*5;
            }
        }
        return next_ugly;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getUglyNumber(n));
    }
}
