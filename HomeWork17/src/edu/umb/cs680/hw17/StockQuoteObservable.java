package edu.umb.cs680.hw17;

import java.util.HashMap;

public class StockQuoteObservable extends Observable
{
    HashMap<String,Integer> map = new HashMap<>();
    public void changeQuote(String t,double q)
    {
        notifyObservers(new StockEvent(t,q));
    }
    public void update(Observer<StockEvent> sender, Object event)
    {
        System.out.println("updating");
    }
}
