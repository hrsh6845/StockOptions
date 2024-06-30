package StockOptions.models;

import StockOptions.models.OptionChain;

public interface IOptionsChain {
    OptionChain GetOption(String symbol);
}
