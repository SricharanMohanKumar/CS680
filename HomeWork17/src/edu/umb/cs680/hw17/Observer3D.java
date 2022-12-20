package edu.umb.cs680.hw17;

public class Observer3D implements Observer
{

    public void update(Observable<StockEvent> sender, StockEvent event)
    {
        String a = event.getTicker();
        String b = String.valueOf(event.getQuote());
        System.out.println("Tiker or Quote modified for Observer3D observer updated values are as below.");
        System.out.println("Ticker = " + a +" Quote = "+b);
    }

    public void update(Observable sender, Object event) {

    }
}
