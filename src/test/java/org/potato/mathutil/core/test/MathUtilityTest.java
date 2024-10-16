package org.potato.mathutil.core.test;

import org.junit.jupiter.api.Test;
import org.potato.mathutil.core.MathUtility;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(87);});


//        MathUtility.getFactorial(-5);
    }//Thay ngoai le mung roi nuoc mat vi ham thiet ke rang dua n < 0 hoac n > 20

    //Test case #4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23
    @Test

    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
//        MathUtility.getFactorial(-5);
    }//Thay ngoai le mung roi nuoc mat vi ham thiet ke rang dua n < 0 hoac n > 20

    //Test case #3 (): check getFactorial() with n = 2 3 4 5 6
    @Test
    public void testFactorialGivenRightArgumentsReturnsWell() {


        //SO SANH 2 THANG EXPECTED VS. ACTUAL
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(720,MathUtility.getFactorial(6));
    }//bad smells = code boc mui (Robert C. Martin - Clean Code)

    //Test case #2: check getFactiral() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnsWell() {
        long expectedValue = 1; // hy vong 0! tra ve 1
        long actualValue = MathUtility.getFactorial(1); // gia bo ham tra ve 10

        //SO SANH 2 THANG EXPECTED VS. ACTUAL
        assertEquals(expectedValue, actualValue);
    }

    //Test case stucture : ID, Description, Steps/Procedures, Expected Result, Status, (Bug ID )
    //Test case #1: Check getFactorial() with n = 0
    // ...



    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expectedValue = 1; // hy vong 0! tra ve 1
        long actualValue = MathUtility.getFactorial(0); // gia bo ham tra ve 10

        //SO SANH 2 THANG EXPECTED VS. ACTUAL
        assertEquals(expectedValue, actualValue);
    }
}