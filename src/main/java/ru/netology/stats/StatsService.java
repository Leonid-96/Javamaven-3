package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth += (int) sales[i];
        }
        return sumMonth;
    }

    // Средняя сумма продаж в месяц
    public int averageSales(long[] sales) {
        int averageSumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSumMonth += (int) sales[i];
        }
        return averageSumMonth / sales.length;
    }

    // Номер месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int lessAverageSales(long[] sales) {
        int lessSales = 0;
        int averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales++;
            }
        }
        return lessSales;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int moreAverageSales(long[] sales) {
        int moreSales = 0;
        int averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales++;
            }
        }
        return moreSales;
    }
}


