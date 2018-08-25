package TestngPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	   String message = "Manisha";
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test(enabled=false)
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      
	   }
	}