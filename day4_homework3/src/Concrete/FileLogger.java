package Concrete;


public class FileLogger extends BaseLoggerManager {

	@Override
	public void log() {
		System.out.println("Dosyaya loglandı");
	}
}
