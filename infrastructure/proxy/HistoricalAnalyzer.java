package infrastructure.proxy;
public interface HistoricalAnalyzer {
    AnalysisResult analyzePastPerformance(String runnerProfileId, String terrainType);
}

public class CachedHistoricalAnalyzerProxy implements HistoricalAnalyzer {
    private DefaultHistoricalAnalyzer realAnalyzer;
    private Cache<String, AnalysisResult> resultCache;

    @Override
    public AnalysisResult analyzePastPerformance(String profileId, String terrain) {
        // Lógica conceptual: Verificar caché antes de instanciar realAnalyzer
        return resultCache.getOrLoad(...);
    }
}