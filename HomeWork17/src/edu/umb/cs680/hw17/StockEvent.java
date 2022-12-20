package edu.umb.cs680.hw17;
public class StockEvent
{
    String ticker;
    Double quote;
    public StockEvent(String t, double q)
    {
        this.ticker=t;
        this.quote=q;
    }

    public String getTicker()
    {
        return ticker;
    }

    public Double getQuote()
    {
        return quote;
    }
}