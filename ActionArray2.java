
import java.util.Scanner;

public class ActionArray implements MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enter=0;
		Scanner s = new Scanner(System.in);
		 System.out.print("Enter no. of elements you want in array:");
		int n = s.nextInt();
		ActionArray a1 = new ActionArray();
	    int a[] = new int[n];
		System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }		
		      for(int i=0;i<a.length;i++) {
		    	  System.out.println("Entered value is: "+a[i]);
			   }
		      System.out.println("Enter your chooes 1 for delete or 2 for insert");
		      enter = s.nextInt();
		     switch (enter) {
			  case 1:
				  System.out.print("Enter the element you want to delete:");
				  int x = s.nextInt();
				int[] na=a1.delete(a,x,n);  
				break;
			  case 2:
				  System.out.print("Enter the element you want to Insert:");
				  int x1 = s.nextInt();
				  int[] na1=a1.insert(a,x1,n); 
			  default:
				System.out.println("Kindly chooes option");
				break;
			}
		     
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] insert(int[] a,int x1,int n) {
		// TODO Auto-generated method stub
		 for(int i = (n-1); i >= (x1-1); i--)
	        {
	            a[i+1] = a[i];
	        }
	        a[x1-1] = x1;
	        System.out.print("After inserting:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	        System.out.print(a[n]);
			return a;
	    }

	@Override
	public int[] get() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int[] delete(int[] a, int x,int n) {
		// TODO Auto-generated method stub
		int flag = 1, loc = 0;
		for (int i = 0; i < n; i++) 
        {
            if(a[i] == x)
            {
                flag =1;
                loc = i;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            for(int i = loc+1; i < n; i++)
            {
                a[i-1] = a[i];
            }
            System.out.print("After Deleting:");
            for (int i = 0; i < n-2; i++) 
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
		return a;
    }
	}



