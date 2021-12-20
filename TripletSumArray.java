import java.util.Scanner;


public class TripletSumArray{
// Prints all triplets in arr[] with 0 sum
	static void findTriplets(int[] arr, int n)
	{
    	boolean found = true;
    	for (int i=0; i<n-2; i++)
    	{
        	for (int j=i+1; j<n-1; j++)
        	{
            	for (int k=j+1; k<n; k++)
            	{
                	if (arr[i]+arr[j]+arr[k] == 0)
                	{
                    	System.out.print(arr[i]);
                    	System.out.print(" ");
                    	System.out.print(arr[j]);
                    	System.out.print(" ");
                    	System.out.println(arr[k]);

	                    found = true;
	                }
	            }
	        }
	    }

    	// If no triplet with 0 sum found in array
    	if (found == false)
        	System.out.println(" not exist ");

	}


	public static void main(String[] args){

		//For taking input from user

		/*Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of 1D array :");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter no. of element equal to the size of array");
                //taking input for array
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }*/


    		int arr[] = {0, -1, 2, -3, 1};
    		int n =arr.length;
    		findTriplets(arr, n);

	}
}
