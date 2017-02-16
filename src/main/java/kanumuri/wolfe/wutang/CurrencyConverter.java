package kanumuri.wolfe.wutang;

import java.text.DecimalFormat;

/**
 * Created by zipcoder on 2/16/17.
 */
public class CurrencyConverter {

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public String convert(double currencyFrom, double currencyTo){
        double result = currencyTo/currencyFrom;
        return decimalFormat.format(result);
    }
}
