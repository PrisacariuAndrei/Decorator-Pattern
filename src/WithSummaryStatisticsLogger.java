
public class WithSummaryStatisticsLogger extends ExecutionTimesBaseStatistics{
    StatisticsLogger logger;
    public WithSummaryStatisticsLogger(StatisticsLogger statisticsLogger){
        super(statisticsLogger.getExecutionTimes());
        logger = statisticsLogger;
    }

    @Override
    public void displayStatistics(){
        System.out.println(
                super.getExecutionTimes()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .summaryStatistics());
        logger.displayStatistics();
    }

}
