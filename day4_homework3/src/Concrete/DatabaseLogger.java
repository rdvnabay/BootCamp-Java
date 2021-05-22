package Concrete;


public class DatabaseLogger extends BaseLoggerManager {

	@Override
	public void log() {
		System.out.println("Veritabanına loglandı");
	}

}
