package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramPMDTest {
	
	 
	
  @Test
  public void testAnagramPMD1() {
	  
	  String s = new String("Debit Card");
	  String t = new String("Bad Credit");
	  
	  System.out.println("Debit Card and Bad Credit is anagram? - " + AnagramPMD.validate(s, t));
	  Assert.assertTrue(AnagramPMD.validate(s, t));
	  
	   
  }

@Test
  public void testAnagramPMD2() {
	  
	  String s = new String("Охренеть");
	  String t = new String("Не хрена себе");
	  
	  System.out.println("Охренеть and Не хрена себе is anagram? - " + AnagramPMD.validate(s, t));
	  Assert.assertFalse(AnagramPMD.validate(s, t));
  }
  
}
