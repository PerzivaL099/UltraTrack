package domain.strategy;

import domain.model.TelemetryData;


public interface PacingStrategy {
    double calculateEstimatedFinishTime(TelemetryData currentData);
    double calculateSodiumLoss(TelemetryData currentData);
}
