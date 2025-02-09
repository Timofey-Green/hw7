import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void theNumberOfTheMonthWithMinimalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void theNumberOfTheMonthWithMaximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.MaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void theSumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.amountSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test

    public void theAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        double actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }


    @Test

    public void monthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelow = 5;
        double actualBelow = service.belowAverage(sales);

        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test

    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAbove = 5;
        double actualAbove = service.aboveAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}
