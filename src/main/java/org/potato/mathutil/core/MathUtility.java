package org.potato.mathutil.core;

public class MathUtility {
    // class cung cap cac ham tien ich cho moi noi su dung
    // tien ich cho moi noi dung => thuong thiet ke la static

    // ham tinh n! = 1.2.3.4...n
    // < 0 va 21! > ta ko tinh, ko co am giai thua. 20! vua du kieu long
    //0! = 1! = 1
    // 0! va 21!, 22! ta se chui, nem ra ngoai le
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid factorial. Must be between 0 and 20!!!");
        if (n==0 || n==1)
            return 1;

        // song sot den buoc nay, n = 2, 3, 4, ..., 20
        long result = 1; // tich ban dau bang 1
        for (int i = 2; i <= n ; i++)
            result *= i; // nhan don con i vao ket qua

        return result;
    }
}
