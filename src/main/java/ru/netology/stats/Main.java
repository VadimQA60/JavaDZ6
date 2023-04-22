package ru.netology.stats;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int resultMin = servise.minSales(sales);
        int totalofallsales = servise.totalofallsales(sales);
        long AllMount = servise.AllMount(sales);
        long YearAverage = servise.YearAverage(sales);
        long AverageAbove = servise.AverageAbove(sales);
        long AverageBelow = servise.AverageBelow(sales);

        System.out.println(resultMin);
        System.out.println(totalofallsales);
        System.out.println(AllMount);
        System.out.println(YearAverage);
        System.out.println(AverageAbove);
        System.out.println(AverageBelow);