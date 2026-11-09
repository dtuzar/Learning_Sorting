import java.util.Arrays;

public class SortingLab 
{
	public static void bubbleSort(String[] arr)
	{
		char hold = 0;
		for (int n = arr.length - 1; n >= 0; n--)
		{
			for (int x = 0; x < n; x++)
			{
				char plus = arr[1].substring(1, 2);
				char norm = arr[0].substring(0, 1);
				if (arr[x + 1] < arr[x])
				{			
					hold = arr[x];
					arr[x] = arr[x + 1];					
					arr[x + 1] = hold;
				}
			}
		}
	}
	
	public static void bubbleSort(int[] arr)
	{
		int hold = 0;
		for (int n = arr.length - 1; n >= 0; n--)
		{
			for (int x = 0; x < n; x++)
			{
				if (arr[x + 1] < arr[x])
				{			
					hold = arr[x];
					arr[x] = arr[x + 1];					
					arr[x + 1] = hold;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for (int x = 1; x < arr.length; x++)
		{
			int n = x;
			while((n - 1 != -1) && (arr[n] < arr[n - 1]))
			{
				int s = arr[n];
				int b = arr[n - 1];
				arr[n - 1] = s;
				arr[n] = b;
				n--;
			}
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		for (int x = 0; x < arr.length; x++)
		{
			int min = arr[x];
			int ind = x;
			int big = arr[x];
			int bigi = x;
			for (int i = x; i < arr.length; i++)
			{
				if (arr[i] < min)
				{
					ind = i;
					min = arr[i];
				}
			}
			arr[ind] = big;
			arr[bigi] = min;
		}
	}
	
	public static void mergeSort(int[] arr)
	{
		if (arr.length > 1)
		{
			int[] left = new int[arr.length/2];
			int[] right = new int[(arr.length + 1) / 2];
			
			for (int i = 0; i < left.length; i++)
			{
				left[i] = arr[i];
			}
			for (int i = 0; i < right.length; i++)
			{
				right[i] = arr[i + left.length];
			}
				
			mergeSort(left);	
			mergeSort(right);
			merge(arr, left, right);
		}
		
		//Because mergeSort is recursive, though you want the user to see a method
		//with only a single input, you will need to pass more arguments... so this
		//here is just a helper method that's going to call the REAL mergeSort that
		//does the work.  The user is happier not seeing how the sausage is made... 
		
	}
	
	public static int[] merge(int[] result, int[] a, int[] b)
	{
		int ai = 0;
		int bi = 0;
		int i = 0;
		
		while (i < result.length)
		{
			if (ai >= a.length)
			{
				result[i] = b[bi];
				bi++;
				i++;
			}
			else if (bi >= b.length)
			{
				result[i] = a[ai];
				ai++;
				i++;
			}
			else if (a[ai] <= b[bi])
			{
				result[i] = a[ai];
				i++;
				ai++;
			}
			else if (b[bi] <= a[ai])
			{
				result[i] = b[bi];
				i++;
				bi++;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		String[] dwarves = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		int[] arrInts = {40, 20, 60, 90, 30, 10, 50, 80, 70};
		
		//Testing code for sorting
		System.out.println("Originally:  " + Arrays.toString(dwarves));
			
		System.out.println("Bubble sort: " + Arrays.toString(dwarves));		
		
		System.out.println("Originally:  " + Arrays.toString(arrInts));
		bubbleSort(arrInts);
		System.out.println("new:  " + Arrays.toString(arrInts));
		//Print out array post-sorting.  Don't forget that the array itself is being altered
		//so every time you want to try a new sort, you have to mix it up again! 

	}

}
