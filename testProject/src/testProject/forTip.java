package testProject;

public class forTip {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n===================");
		
		for(int num : arr) { // 같은 결과값
			System.out.print(num+" ");
		}
	}
}
