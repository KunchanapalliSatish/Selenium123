package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgPratice1 {
  @Test
  public void f() {
  }
  @Test(dataProvider = "dp1" )
  public void TestLogin1(String s) {
	  System.out.println(s);
  }
  
  @DataProvider(indices = {1,2,3})
  public  String[] dp1() {
	  String [] data = new String[] {
			  "satish" ,
			  "bhavani",
			  "satya",
			  "team"
	  };
	  return data;
}
}
