import java.util.Scanner;
public class DuplicateElements {
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=Scanner.nextInt();
		int[] array=new int[size];
		System.out.println("enter the elements of the array:");
		for (int i=0;i<size;i++) {
			array[i]=Scanner.nextInt();
	    }
		boolean hasDuplicates=false;
		int position1=-1;
		int position2=-2;
		for (int i=0;i<array.length;i++) 
		{
			for (int j=0;j<array.length;j++) 
			{
				if(array[i]==array[j]) 
				{
					hasDuplicates=true;
					position1=i;
					position2=j;
					break;
				}
			}
			if(hasDuplicates) 
			{
				break;
				
			}
		}
		if(hasDuplicates) 
		{
			System.out.println("array contains duplicate elements at positions"+position1+"and"+position2);
		}
		else
		{
			System.out.println("array does not contains duplicate elements");
		}
		Scanner.close();
	}
}
