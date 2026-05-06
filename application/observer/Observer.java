package application.observer;

public interface Observer {
    void update(TelemetrySubject latestData, Alert optionalAlert);
    void detach(Observer observer);
    void notifyObservers(TelemetryData data, Alert alert);
}


