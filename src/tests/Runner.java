package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		TestNG testng = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add(path + "\\testng.xml");
		testng.setTestSuites(suites);
		testng.run();
	}


}
