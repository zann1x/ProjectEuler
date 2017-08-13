public class Stopwatch {
	private double startTime;
	private double stopTime;

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		stopTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		sb.append("\n").append(stopTime - startTime).append(" ms");
		System.out.println(sb);
	}
}
