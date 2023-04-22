package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalofallsales(long[] sales) {
        int MaxMonth = 0; // Максимальная сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public long AllMount(long[] sales) {
        int TheAmount = 0;
        for (long sale : sales) {
            TheAmount += sale;

        }
        return TheAmount;
    }

    public long YearAverage(long[] sales) {

        return AllMount(sales) / sales.length;
    }

    public long AverageAbove(long[] sales) {
        int AverageAbove = 0;
        for (long month : sales) {
            if (month > YearAverage(sales)) {
                AverageAbove++;
            }

        }
        return AverageAbove;
    }

    public long AverageBelow(long[] sales) {
        int AverageBelow = 0;
        for (long month : sales) {
            if (month < YearAverage(sales)) {
                AverageBelow++;
            }
        }
        return AverageBelow;
    }

}
