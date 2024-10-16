package org.potato.mathutil.main;

import org.potato.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnWell();
        testFactorialGivenRightArgument5ReturnWell();

    }

    //TEST CASE #2
    //DESCRIPSTION (MO TA MUC DICH TEST CASE, TEST CASE DUNG TEST DIEU GI)
    //              TO CHECK, TO VERIFY THE getFactorial() method with correct given argument, e.g n = 5
    //STEPS/PROCEDURES: (CAC BUOC TEST HAM/APP, NHAN GI, NHAP GI, ..)
    //                  CALL getFactorial() method with valid arg: getFactorial(5)
    //EXPECTED RESULT (TA HI VONG HAM TRA VE GI KHI n = 0)
    //                  To have num 120 as the result of 5!
    //STATUS (TRANG THAI CUA TEST CASE LA GI SAU KHI APP CHAY HAM)
    //                  PASSED, FAILED (BUG)
    // ===> NGONNNNNNNNNNNNNNNNNNNNNN!
    //                  CHO XEM HAM, APP XU LY DC SO MAY - ACTUAL VALUE
    //                  VA DI SS VOI EXPECTED O TREN DE LUAN DUNG SAI

    static void testFactorialGivenRightArgument5ReturnWell(){
        int n = 5; //du tinh tinh 0!
        long expectedResult = 120; // 0! hy vong la 1
        long actualResult = MathUtility.getFactorial(5); // tinh thi 0! bang ham

        // so sanh
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }

    // ta se test ham cua ta viet ra -- UNIT TEST - TEST nhung don vi code co ban nhat
    // ta can test ham getFactorial() voi cac bo data dua vao => test case
    // test case: nhung bo data dua vao ham, app va cach thuc xai data nay va ket qua ki vong app/ham se tra ve

    //TEST CASE #1
    //DESCRIPSTION (MO TA MUC DICH TEST CASE, TEST CASE DUNG TEST DIEU GI)
    //              TO CHECK, TO VERIFY THE getFactorial() method with correct given argument, e.g n = 0
    //STEPS/PROCEDURES: (CAC BUOC TEST HAM/APP, NHAN GI, NHAP GI, ..)
    //                  CALL getFactorial() method with valid arg: getFactorial(0)
    //EXPECTED RESULT (TA HI VONG HAM TRA VE GI KHI n = 0)
    //                  To have num 1 as the result of 0!
    //STATUS (TRANG THAI CUA TEST CASE LA GI SAU KHI APP CHAY HAM)
    //                  PASSED, FAILED (BUG)
    // ===> NGONNNNNNNNNNNNNNNNNNNNNN!
    //                  CHO XEM HAM, APP XU LY DC SO MAY - ACTUAL VALUE
    //                  VA DI SS VOI EXPECTED O TREN DE LUAN DUNG SAI

    //VIET CODE TEST DET TEST HAM CHINH getFactorial() CHAY DUNG VOI N = 0 HAY KO
    static void testFactorialGivenRightArgument0ReturnWell() {
        int n = 0; //du tinh tinh 0!
        long expectedResult = 1; // 0! hu vong la 1
        long actualResult = MathUtility.getFactorial(n); // tinh thi 0! bang ham

        // so sanh
        System.out.println(n + "! = \n"
                          + "expected value: " + expectedResult + "\n"
                          + "actual value: " + actualResult);
    }


}