package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    // Сумма всех продаж
    public void shouldSumSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Средняя сумма продаж в месяц
    public void shouldAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Номер месяца с максимальными продажами
    public void shouldFindMaxMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Номер месяца с минимальными продажами
    public void shouldFindMinMonth() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Количество месяцев, в которых продажи были ниже среднего
    public void shouldLessAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Количество месяцев, в которых продажи были выше среднего
    public void shouldMoreAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.moreAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
