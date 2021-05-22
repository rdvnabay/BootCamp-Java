public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void log(String message) {
		JLoggerManager loggerManager=new JLoggerManager();
		loggerManager.log(message);
	}
}
