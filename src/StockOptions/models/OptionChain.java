package StockOptions.models;

import java.math.BigDecimal;
import java.util.Date;

public class OptionChain {
   String ticker; // Name of the Symbol.
   BigDecimal current; // Current price of the security.
   BigDecimal strike; // Strike Price to execute at.
   BigDecimal median; // median bid vs ask.
   BigDecimal lastPrice; // Sum of median and strike price.
   Date execute; // Date till the contract can be valid.
}
