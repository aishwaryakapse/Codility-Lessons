/*
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

int solution(int A[], int N);
that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 */
package lesson3;
/*
 * Author : Aishwarya Nitin Kapse
 */
public class PermMissinElem {
	private static int firstMissingPositive(int[] A) {
		
		if(A == null || A.length == 0) {
			System.out.println("No Solution Bruh!!!");
			return -1;
		}
		
		for(int i=0; i<A.length; i++) {
			while(A[i] != i+1) {
				if(A[i] <=0 || A[i] >= A.length) {
					break;
				}
				
				if(A[i] == A[A[i] - 1]) {
					break;
				}
				
				int temp = A[i];
				A[i] = A[temp - 1];
				A[temp - 1] = temp;
			}
		}
		
		for(int i=0; i<A.length; i++) {
			if(A[i] != i+1) {
				return i + 1;
			}
		}
		
		
		return A.length+1; // temporary command
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6};
		System.out.println(firstMissingPositive(A));
	}

}
