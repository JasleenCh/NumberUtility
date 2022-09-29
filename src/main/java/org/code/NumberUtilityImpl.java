package org.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberUtilityImpl implements NumberManipulation{

    public List<Integer> squareEachInteger(Integer[] numbers) {
        List<Integer> squareNumbers = Arrays.asList(numbers).stream().map(i -> i*i).collect(Collectors.toList());
        return squareNumbers;
    }

    public  List<Integer> filterMutiplesOfThree(Integer[] numbers) {
        List<Integer> filterCollection = Arrays.asList(numbers).stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        return filterCollection;
    }

    @Override
    public List<Integer> adjacentSumOfNumbers(Integer[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        int previous_1 = 0;
        int previous_2=  0;
        for (int i=1;i<numbers.length;i++){
            previous_1 = numbers[i - 1];
            if(i-2 >=0) {
                previous_2 = numbers[i - 2];
            }
            Integer newNumber = previous_1 + previous_2 + numbers[i];
            numbersList.add(newNumber);
        }
        return numbersList;
    }
}
