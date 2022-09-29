package org.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilityImplTest {

    @Test
    void squareEachInteger() {
        Integer [] OriginalNumbers = new Integer[]{2,5};
        NumberManipulation numberManipulation = new NumberUtilityImpl();
        List<Integer> squareNumbers = numberManipulation.squareEachInteger(OriginalNumbers);
        Assertions.assertEquals(squareNumbers.get(0),4);
        Assertions.assertEquals(squareNumbers.get(1),25);
        Assertions.assertEquals(squareNumbers.size(),2);
    }

    @Test
    void filterMutiplesOfThree() {
        Integer [] OriginalNumbers = new Integer[]{2,3,6,10};
        NumberManipulation numberManipulation = new NumberUtilityImpl();
        List<Integer> squareNumbers = numberManipulation.filterMutiplesOfThree(OriginalNumbers);
        Assertions.assertEquals(squareNumbers.get(0),3);
        Assertions.assertEquals(squareNumbers.get(1),6);
        Assertions.assertEquals(squareNumbers.size(),2);

    }

    @Test
    void adjacentSumOfNumbers() {
        Integer [] OriginalNumbers = new Integer[]{2,3,6,10};
        NumberManipulation numberManipulation = new NumberUtilityImpl();
        List<Integer> adjacentSumOfNumbers = numberManipulation.adjacentSumOfNumbers(OriginalNumbers);
        System.out.println(adjacentSumOfNumbers);
        Assertions.assertEquals(adjacentSumOfNumbers.get(0),5);
        Assertions.assertEquals(adjacentSumOfNumbers.get(1),11);
        Assertions.assertEquals(adjacentSumOfNumbers.get(2),19);
        Assertions.assertEquals(adjacentSumOfNumbers.size(),3);
    }
}