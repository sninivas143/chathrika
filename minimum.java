import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int n, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(min < a[i])
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value:"+max);
    }
}
	
