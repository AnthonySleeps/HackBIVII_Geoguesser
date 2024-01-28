
public class TimeImage {
	private String fileName;
	private int timePeriod;
	
	public TimeImage(String s, int time) {
		fileName = s;
		timePeriod = time;
	}
	
	public int getTime() {
		return timePeriod;
	}
	
	public int getFileName() {
		return fileName;
	}
}
