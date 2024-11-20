package com.jwetherell.algorithms.mathematics.test;

import com.jwetherell.algorithms.mathematics.Division;

import org.junit.Test;
import static org.junit.Assert.*;


public class DivisionTest {
    final int numerator = 4;
    final int evenDenominator = -2;
    final int remainderDenominator = 3;
    final int zeroDenominator = 0;

    final long expectedEvenResult = -2;
    final long expectedRemainderResult = 1;

    @Test
    public void testDivision() {
        final long x = Division.division(numerator, evenDenominator);
        final long y = Division.division(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test
    public void testDivisionUsingMultiplication() {
        final long x = Division.divisionUsingMultiplication(numerator, evenDenominator);
        final long y = Division.divisionUsingMultiplication(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test
    public void testDivisionUsingRecursion() {
        final long x = Division.divisionUsingRecursion(numerator, evenDenominator);
        final long y = Division.divisionUsingRecursion(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test
    public void testDivisionUsingLoop() {
        final long x = Division.divisionUsingLoop(numerator, evenDenominator);
        final long y = Division.divisionUsingLoop(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test
    public void testDivisionUsingLogs() {
        final long x = Division.divisionUsingLogs(numerator, evenDenominator);
        final long y = Division.divisionUsingLogs(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test
    public void testDivisionUsingShift() {
        final long x = Division.divisionUsingShift(numerator, evenDenominator);
        final long y = Division.divisionUsingShift(numerator, remainderDenominator);

        assertEquals(expectedEvenResult, x);
        assertEquals(expectedRemainderResult, y);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        final long x = Division.division(numerator, zeroDenominator);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZeroUsingMultiplication() {
        final long x = Division.divisionUsingMultiplication(numerator, zeroDenominator);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZeroUsingRecursion() {
        final long x = Division.divisionUsingRecursion(numerator, zeroDenominator);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZeroUsingLoop() {
        final long x = Division.divisionUsingLoop(numerator, zeroDenominator);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZeroUsingLogs() {
        final long x = Division.divisionUsingLogs(numerator, zeroDenominator);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZeroUsingShift() {
        final long x = Division.divisionUsingShift(numerator, zeroDenominator);
    }
}
