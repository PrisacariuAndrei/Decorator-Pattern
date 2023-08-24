
public class WithMeanStatisticsLogger extends ExecutionTimesBaseStatistics{
    StatisticsLogger logger;
    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger){
        super(statisticsLogger.getExecutionTimes());
        logger = statisticsLogger;
    }

    @Override
    public void displayStatistics(){
        System.out.println(
                super.getExecutionTimes()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0));
        logger.displayStatistics();
    }

}
