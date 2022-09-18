package learnAttributes;

import org.testng.annotations.Test;

public class LearnDependencies {
	
			@Test
			public void testB() {
				
			}
			
			@Test(dependsOnMethods= {"testB"})
			public void testA() {
				
			}
			
			@Test
			public void testC() {
	
}

}
