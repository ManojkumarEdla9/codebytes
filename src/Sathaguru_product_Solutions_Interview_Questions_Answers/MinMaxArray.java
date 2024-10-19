package Sathaguru_product_Solutions_Interview_Questions_Answers;

public class MinMaxArray {
public static void main(String[] args) {
	int[] arr= {23,4,32,5,75,12,73,93,38,51};
	int min=arr[0];
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Maximum Element of Array: "+max);
	System.out.println("Minimum Element of Array: "+min);
}
}
