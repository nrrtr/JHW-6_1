package ru.netology.stats;

public class StatsService {
    public int sumOfSales(long[] sales) {
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            result += sales[i];
        }
        return result;
    }

    public int averageSalesAmount(long[] sales) {
        int average = sumOfSales(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int tmpMax = 0;
        int tmp = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (sale >= sales[tmpMax]) {
                tmpMax = tmp;
            }
            tmp = tmp + 1;
        }
        return tmpMax + 1;
    }

    public int minSales(long[] sales) {
        int tmpMin = 0;
        int tmp = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (sale <= sales[tmpMin]) {
                tmpMin = tmp;
            }
            tmp = tmp + 1;
        }
        return tmpMin + 1;
    }

    public int countOfAboveAverageSales(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount(sales)) {
                count++;
            }
        }
        return count;
    }

    public int countOfBelowAverageSales(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount(sales)) {
                count++;
            }
        }
        return count;
    }
}
