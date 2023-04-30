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

    public int totalOFallSales(long[] sales) {
        int MaxMonth = 0; // Максимальная сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public long allMount(long[] sales) {
        int TheAmount = 0;
        for (long sale : sales) {
            TheAmount += sale;

        }
        return TheAmount;
    }

    public long yearAverage(long[] sales) {

        return allMount(sales) / sales.length;
    }

    public int averageAbove(long[] sales) {
        long averageAbove = yearAverage(sales);

        int month = 0;
        for (long number : sales) {
            if (number > averageAbove) {
                month = month + 1;

            }

        }
        return month;
    }


    public int averageBellow(long[] sales) {
        long averageBellow = yearAverage(sales);

        int month = 0;
        for (long number : sales) {
            if (number < averageBellow) {
                month = month + 1;
            }
        }
        return month;
    }
}










