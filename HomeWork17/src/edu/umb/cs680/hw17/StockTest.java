package edu.umb.cs680.hw17;

import org.junit.jupiter.api.Test;

class StockTest {

    @Test
    public void ObservableUpdateTest()
    {
        int j=0;
        StockQuoteObservable obj=new StockQuoteObservable();
        LineChartObserver obj1=new LineChartObserver();
        obj.addObserver(obj1);
        for(int i=0; i<20; i++)
        {
            j+=10;
            if(i%5==0)
            {
                obj.changeQuote("Tesla", 600+j);
            }
            else
                System.out.println("No Change");
        }
    }
    @Test
    public void AddRemoveUpdateTest() {
        StockQuoteObservable observable = new StockQuoteObservable();
        Observer<StockEvent> LineChartObserver = (Observable<StockEvent> sender, StockEvent event) -> {
            System.out.println("Tiker or Quote modified for LineChartObserver observer");
        };
        Observer<StockEvent> TableObserver = (Observable<StockEvent> sender, StockEvent event) -> {
            System.out.println("Tiker or Quote modified for TableObserver observer ");
        };
        Observer<StockEvent> Observer3D = (Observable<StockEvent> sender, StockEvent event) -> {
            System.out.println("Tiker or Quote modified for Observer3D observer ");
        };
        observable.addObserver(LineChartObserver);
        observable.addObserver(TableObserver);
        observable.addObserver(Observer3D);
        observable.removeObserver(TableObserver);
        observable.changeQuote("WIPRO",200);
        observable.removeObserver(LineChartObserver);
        observable.changeQuote("WIPRO",210);
        observable.update(Observer3D,230);
    }

}
