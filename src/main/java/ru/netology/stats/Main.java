package ru.netology.stats;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int resultMin = service.minSales(sales);
        int totalOFallSales = service.totalOFallSales(sales);
        long allMount = service.allMount(sales);
        long yearAverage = service.yearAverage(sales);
        long averageAbove = service.averageAbove(sales);
        long averageBellow = service.averageBellow(sales);

        System.out.println(resultMin);
        System.out.println(totalOFallSales);
        System.out.println(allMount);
        System.out.println(yearAverage);
        System.out.println(averageAbove);
        System.out.println(averageBellow);
    }
}