package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int max=0;
		int pointer = 0;
		int result[] = new int[2];
		for(int i=0; i<arr.length-1; i++) {
			//System.out.println("i의 값 :"+i);
			pointer++;
			for(int j=pointer; j<arr.length; j++) {
				if(j==arr.length) {
					break;
				}else {
					int tmp = arr[i]*arr[j];
					//System.out.println("arr["+i+"]*arr["+j+"] 곱한값"+tmp);
					if(max<tmp) {
						max = tmp;
						result[0]=arr[i];
						result[1]=arr[j];
					}
				}
			}
		}
		System.out.println("["+result[0]+","+result[1]+"]");
	}
}
