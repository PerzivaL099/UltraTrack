package infrastructure.iterator;

public interface TelemetryCollection {
    Iterator<TelemetryData> createIterator();
}
