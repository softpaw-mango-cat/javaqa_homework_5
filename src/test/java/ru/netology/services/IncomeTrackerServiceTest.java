package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class IncomeTrackerServiceTest {

    @Test
    public void testAmountOfFreeDaysLowIncome() {
        IncomeTrackerService service = new IncomeTrackerService();
        int expected = 3;
        int actual = service.calculateFreeMonths(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAmountOfFreeDaysBigIncome() {
        IncomeTrackerService service = new IncomeTrackerService();
        int expected = 2;
        int actual = service.calculateFreeMonths(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testdata.csv")
    public void testAmountOfFreeDaysVariousIncomes(int expected, int income,
                                                   int expenses, int threshold) {
        IncomeTrackerService service = new IncomeTrackerService();
        int actual = service.calculateFreeMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
