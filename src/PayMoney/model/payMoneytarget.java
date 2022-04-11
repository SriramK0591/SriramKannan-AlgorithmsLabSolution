package PayMoney.model;

import java.util.Scanner;

public class payMoneytarget
{
    private int array[];
    public int targetcheck(int tmp, int[] array)
    {
        int total = 0;
        // Time complexity is O(n) and the space complexity is O(1)
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
            if (tmp <= total) {
                return i + 1;
            }
        }
        return -1;
    }
}



