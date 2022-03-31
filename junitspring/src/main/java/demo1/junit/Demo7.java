package demo1.junit;



import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class Demo7 {

	@Test
	@Tag("my-tag")
	void test(TestInfo testInfo, TestReporter testReporter) {
		
	String displayName =	testInfo.getDisplayName();
	
		System.out.println(displayName);
		
		testReporter.publishEntry(displayName);
	}
}