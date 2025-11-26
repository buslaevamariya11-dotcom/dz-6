package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxNormalCase() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 15, 8};
        long expected = 15;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxAtTheBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {20, 10, 5};
        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7};
        long expected = 7;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}
