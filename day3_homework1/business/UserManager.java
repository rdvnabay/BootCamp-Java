public class UserManager {

	private BaseLogger baseLogger;

	public UserManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Kullanıc eklendi");
		baseLogger.log("log mesajı");
	}
}
