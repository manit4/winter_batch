
public class JudithMock {
	
	public static void main(String[] args) {
		
		
		int[] numbers = {4, 2, 6, 5, 10, 243, 12};
		
		int comparingNo = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			
			if(comparingNo < numbers[i]) {
				comparingNo = numbers[i];
			}
		}
		System.out.println("The Biggest Number is "+comparingNo);
	}

}
