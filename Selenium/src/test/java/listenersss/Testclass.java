package listenersss;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testclass {
 
      @BeforeSuite
      public void beforeSuite() {
          System.out.println("Am in Before Suite");
      }
     
      @Test
      public void t() {
          System.out.println("In Test Method t...");
      }
  }

