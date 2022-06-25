package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMaxAgain() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {3, 4};
        long expected = 4;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
