package application.facade;

import application.observer.TelemetrySubject;
import infrastructure.proxy.HistoricalAnalyzer;
import infrastructure.iterator.TelemetryCollection;

public class RaceMonitorFacade {
    private TelemetrySubject telemetrySubject;
    private HistoricalAnalyzer historicalanalyzer;

}

public void processNewTelemetry(String runnerId, TelemetryCollection rawData){
   /*
   1.- Use Iterator to process rawData
   2.- Use Proxy for historical context
   3.- Apply Strategy based on running terrain
   4.- If anomaly detected, trigger alert in a decorator
   5.- Notify observers with processed data
    */ 
}