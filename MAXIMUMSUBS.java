/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MAXIMUMSUBS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
          int minutes = input.nextInt();
          int submissionInSeconds = 30;
          int totalTimeInSeconds = minutes*60;
          int cantSubmitInLastSeconds = 5;
          int allotedTimeForSubmission = totalTimeInSeconds - cantSubmitInLastSeconds;
          int maxSubmission = (allotedTimeForSubmission + submissionInSeconds - 1)/submissionInSeconds; /* This is mathematical way of writing Ceiling method, ofcourse code has already done the job of importing java.lang.* for us to use ceiling method, but this will help readers to understand exact calulation involved in solving problems (clients) requirement */
                    
          System.out.println(maxSubmission);          
        }
        input.close();
        //I am just trying to submit Readable code so that anyone can understand what code is doing, also, instead of multiplying directly by 2, I thought to write code which will simulate problems (Clients) requirement, rather than my own implementation
        /* Approach for solving problem
        1) all variables to be given  relevant name for improving readability(only variable t is remaining to get proper name) 
        2) multiplying by 2 is directly solving the problem, but it doesn't addresses the requirement. Suppose tomorrow client may want to do sommething in allotedTimeForSubmission or do sommething with those last 5 seconds, then client should be able to extend the code and not modify the code (Open/Closed Principle)
        3) Either you can directly use Math.ceil() method of java.lang or you can use formula above which does the same job without importing any java.lang class.
        4) I am not going to explain why I used Ceiling formula here, please atleast do something on your own (-;)
        */
            

		// your code goes here /* Thanks Codechef for giving space here */
	}
}
