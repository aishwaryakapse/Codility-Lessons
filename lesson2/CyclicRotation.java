package lesson2;

public class CyclicRotation {
	public int[] rotate(int[] A, int k) {
		if(A == null || A.length <= 1 || k<= 0) {
			return A;
		}
		
		if(k > A.length) {
			k = k% A.length;
		}
		
		int a = A.length - k;
		reverse(A, 0, a-1);
		reverse(A, a, A.length-1);
		reverse(A, 0, A.length-1);
		return A;
	}
	
	public void reverse(int[] A, int l, int r) {
		while(l < r) {
			int temp;
			temp = A[l];
			A[l] = A[r];
			A[r] = temp;
			l++;
			r--;
		}
	}
	
	public void printArray(int[] A) {
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] A = {1, 2, 34, 5, 6, 3, 6, 32, 443, 54};
		int k = 4;
	
		CyclicRotation cr = new CyclicRotation();
		cr.printArray(A);
		int[] Z = cr.rotate(A, k);
		System.out.println();
		cr.printArray(Z);
	}

}
