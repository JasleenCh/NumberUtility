package org.code;

public class Main {

    public static void main(String[] args) {
        NumberUtilityImpl numberUtilityImpl = new NumberUtilityImpl();
        PrintUtility printUtility = new PrintUtility();
        String appendFormat = ",";
        Integer[] OriginalNumbers = new Integer[]{3, 6, 7, 8, 9, 12, 15, 17, 359};
        var filterCollection = numberUtilityImpl.squareEachInteger(OriginalNumbers);
        printUtility.print(filterCollection, appendFormat);
        var multiplesOfThree = numberUtilityImpl.filterMutiplesOfThree(OriginalNumbers);
        printUtility.print(multiplesOfThree, appendFormat);
        var adjacentNumbers = numberUtilityImpl.adjacentSumOfNumbers(OriginalNumbers);
        printUtility.print(adjacentNumbers, appendFormat);
    }
}
