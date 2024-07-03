package StockOptionsTest.Options;

import StockOptions.MarketDataApi;
import org.junit.Assert;
import org.junit.Test;

public class OptionTest {
    @Test

    public void checkOptionSymbol(){
        MarketDataApi marketDataApi = new MarketDataApi();

        Assert.assertEquals("AAPL", marketDataApi.Option);
    }
}