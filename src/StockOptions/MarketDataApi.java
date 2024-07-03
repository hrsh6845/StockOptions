package StockOptions;

import java.net.http.HttpClient;

public class MarketDataApi {

    private HttpClient _client = HttpClient.newHttpClient();

    public MarketDataApi() {
        // this is the constructor for the market data api.
        // url = 'https://www.alphavantage.co/query?function=HISTORICAL_OPTIONS&symbol=IBM&apikey=demo'
        //r = requests.get(url)
        //data = r.json()
    }

    private void getDetails(String symbol){
        // call the API to get the details for the stock option.
    }

    // GET /v1/stocks/quotes/SPY/ HTTP/1.1
    // Host: api.marketdata.app
    // Accept: application/json
    // Authorization: Bearer {token}
}
