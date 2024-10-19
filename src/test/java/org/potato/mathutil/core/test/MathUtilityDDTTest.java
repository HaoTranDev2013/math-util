package org.potato.mathutil.core.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.potato.mathutil.core.MathUtility;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //Class chua cac ham kiem thu code theo DDT
    //DATA DRIVEN TESTING, TACH CODE KIEM THU KO GOP CHUNG VOI BO DATA
    //DE DOC CODE KIEM THU, DE DANH GIA DC XEM CO BAO NHIEU TEST CASE DANG DC TEST, DA DU HAY CHUA
    //-> GIUP NGUYE NLY PESTICIDE PARADOX

    //BO DATA DUA VAO TEST SE DE RIENG O 1 HAM PUBLIC STATIC

    // tra ve 1 mang <0 >20
    public static Integer[] initWrongDataSet(){
        return new Integer[]{-1, -2, -3, -4, -100, -5555, 21, 22, 23, 100, 1000};
    }

    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(n);});
    }

    //TEST CASE

    public static Object[][] initRightArguments(){
        return new Object[][]{  {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720}

        };
    }
    @ParameterizedTest
    @MethodSource("initRightArguments")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}