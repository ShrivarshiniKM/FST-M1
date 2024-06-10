package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= { 10,77, 10, 54, -11, 10};
		int result=0;
		int value=30;
		for(int i :numbers) {
			
		if(i==10) {
			result =result+i;
		}
		}
		if(result==value)
		System.out.println(result);
		else {
			System.out.println("False");
		}

	}

}
