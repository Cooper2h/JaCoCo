package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Дополнительный тест с отрицательными числами
    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-5, -8, -3, -12, -1};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Дополнительный тест с одинаковыми числами
    @Test
    void findMaxWithSameNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 7, 7, 7, 7};
        long expected = 7;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    // Дополнительный тест с одним элементом
    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {42};
        long expected = 42;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
