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


    public int MaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long amountSales(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount += s;
        }
        return amount;
    }

    public double averageSales(long[] sales) {
        int months = sales.length;   //количество месяцов
        double amount = amountSales(sales);   // общая сумма продаж
        double averageAmount = amount / months;  // общую сумму продаж делим на количество месяцов
        return averageAmount;
    }

    public int belowAverage(long[] sales) {
        double averageAmount = averageSales(sales);
        int salesBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {     //если в месяце продано меньше, чем среднее значение за месяц.
                salesBelowAverage = salesBelowAverage + 1;
            }
        }
        return salesBelowAverage;
    }


    public int aboveAverage(long[] sales) {
        double averageAmount = averageSales(sales);
        int salesAboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                salesAboveAverage = salesAboveAverage + 1;
            }
        }
        return salesAboveAverage;

    }

}
