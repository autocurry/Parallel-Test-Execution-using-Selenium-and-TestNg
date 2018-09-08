package TestngPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParallelExecution {
	
		   
	   //testing jenkins trigger
	//testing the github connection poll
	   @Test
	   public void firstest() {
	      System.out.println("Inside firsttest()");
	      
	   }
		   
	   @Test
	   public void secondtest() {	
	      System.out.println("Inside secondtest()");     
	       
	   }
	   
	   @Test
	   public void thirdtest() {
	      System.out.println("Inside thirdtest()");
	      
	   }
	   
	   @Test
	   public void fouthtest() {
	      System.out.println("Inside fourthtest()");
	      
	   }
	   @Test
	   public void fifthtest() {
	      System.out.println("Inside fourthtest()");
	      
	   }
	}

