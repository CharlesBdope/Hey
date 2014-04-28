
public class ControlFlow {
  public static void main (String argv[])	{
	  
	  /* for loop */
	  /* prints numbers from 0 to 17 */
	  
	  for (int i=0; i<17; i++)	{
		  System.out.println (i);
		 
	  }
	  
	  /* while loop */
	  /* steps through charArray elements */
	  char charArray[] = ('r','i','a','I','n');
	  int j = 0;
	  
	  while (j < charArray.length)	{
		  Syste,.out.println(charArray[j++]);
	  }
	  /* do...while loop */
	  /* prints 3
	    		2
	    		1 */
	  int k = 3;
	  do  {
		  System.out.println (k);
		  k--;
	  }
	  while (k != 0);
	  
	  /* switch */
	  /* prints "case 13" */
	  int s = 13;
	  switch (s) {
	  case 3:
		  System.out.println("case 3");
		  break;
	  case 13:
		  System.out.println("case 13");
		  break;
	  default:
		  System.out.println("default case");
		  break;
	}
	
	/* if...else */
	/* prints "Bye" */
	if (j - s == 17) {
		System.out.println("Hello");
	}
	else {
		System.out.println ("Bye");
	}
  }
}
