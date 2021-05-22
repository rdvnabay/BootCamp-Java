package Concrete;

public class Utils {
	public static void runLoggers(BaseLoggerManager[] loggers) {
		for(BaseLoggerManager logger:loggers) {
		logger.log();
		}
	}
}
