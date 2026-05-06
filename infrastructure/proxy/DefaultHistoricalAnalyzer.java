package infrastructure.proxy;


public interface DefaultHistoricalAnalyzer {
    AnalysisResult analyzePastPerformance(String runnerProfileId, String terrainType);
}
