import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Statistica.Services.StatsService;

public class StatsServiceTest {

    @Test
    public void testMinSails() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(Sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSails() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(Sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sum(Sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(Sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthBellowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthUpAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthUpAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
