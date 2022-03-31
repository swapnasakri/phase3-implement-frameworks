package demo1.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class Demo4 {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
	System.out.println("Windows test method is running");	
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("Linux test method is running");
	}
}