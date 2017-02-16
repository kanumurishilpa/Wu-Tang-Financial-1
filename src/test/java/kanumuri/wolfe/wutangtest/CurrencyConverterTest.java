package kanumuri.wolfe.wutangtest;

import kanumuri.wolfe.wutang.CurrencyConverter;
import kanumuri.wolfe.wutang.ExchangeRates;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/16/17.
 */
public class CurrencyConverterTest {

    CurrencyConverter currencyConverter;
    ExchangeRates exchangeRates;

    @Before
    public void setUp(){
        currencyConverter = new CurrencyConverter();
        exchangeRates = new ExchangeRates();
    }

    @Test
    public void convertDollarToEuroTest(){
        String expected = "0.94";
        String actual = currencyConverter.convert(exchangeRates.USD, exchangeRates.EUR);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void convertEuroToDollarTest(){
        String expected = "1.06";
        String actual = currencyConverter.convert(exchangeRates.EUR, exchangeRates.USD);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertEuroToBritishPoundTest(){
        String expected = "0.87";
        String actual = currencyConverter.convert(exchangeRates.EUR, exchangeRates.GBP);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertBritishPoundToIndianRupeeTest(){
        String expected = "83.32";
        String actual = currencyConverter.convert(exchangeRates.GBP, exchangeRates.INR);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertRupeeToCanadianDollarTest(){
        String expected = "0.02";
        String actual = currencyConverter.convert(exchangeRates.INR, exchangeRates.CAD);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertCanadianDollarToSingaporeDollarTest(){
        String expected = "1.08";
        String actual = currencyConverter.convert(exchangeRates.CAD, exchangeRates.SGD);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertSingaporeDollarToSwissFrancTest(){
        String expected = "0.71";
        String actual = currencyConverter.convert(exchangeRates.SGD, exchangeRates.CHF);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertSwissFrancToMalaysianRinggitTest(){
        String expected = "4.43";
        String actual = currencyConverter.convert(exchangeRates.CHF, exchangeRates.MYR);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertMalaysianRinggitToJapaneseYenTest(){
        String expected = "25.91";
        String actual = currencyConverter.convert(exchangeRates.MYR, exchangeRates.JPY);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbiTest(){
        String expected = "0.06";
        String actual = currencyConverter.convert(exchangeRates.JPY, exchangeRates.CNY);
        Assert.assertEquals(expected,actual);

    }
}
