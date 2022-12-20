package edu.umb.cs680.hw17;

public class TableObserver implements Observer<StockEvent>
{
    @Override
    public void update(Observable <StockEvent> sender, StockEvent event)
    {
        String a = event.getTicker();
        String b = String.valueOf(event.getQuote());
        System.out.println("Tiker or Quote modified for TableObserver observer updated values are as below.");
        System.out.println("Ticker = " + a +" Quote = "+b);
    }
}
