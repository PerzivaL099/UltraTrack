package application.observer;

public interface TelemetrySubject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(TelemetryData data, Alert alert);
}
