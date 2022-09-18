package org.abstractprograms;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation jav=new Automation();
		jav.Java();
	}

	public void Java() {
		// TODO Auto-generated method stub
		
		System.out.println("Called the interface Language method Java()");
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Called the interface TestLeaf method Selenium()");
		
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		
		//System.out.println("Called the MultipleLangauge abstract class method Selenium()");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Called the interface TestLeaf method Selenium()");
		
	}

}
