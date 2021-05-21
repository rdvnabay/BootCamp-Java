public class LogManager {
	
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritabanı loglandı");
		} else if (logType == 2) {
			System.out.println("Dosya loglandı");
		} else {
			System.out.println("Email loglandı");
		}
	}
}

// logType
// 1-Database
// 2-File
// 3-Email
