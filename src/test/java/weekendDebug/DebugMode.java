package weekendDebug;

import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DebugMode {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a ="+a);
		System.out.println("b ="+b);

	}

}
