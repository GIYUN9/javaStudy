package testProject;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1-iNum2-iNum2); //2
		System.out.println(iNum1-iNum2*2); //2
		
		System.out.println((float)(iNum1)); // 10.0
		System.out.println(iNum2+fNum+fNum); // 10.0
		
		System.out.println(dNum); // 2.5
		System.out.println(iNum1-dNum*fNum); // 2.5
		
		System.out.println((int)(fNum)); // 3
		System.out.println((int)(iNum1-iNum2-fNum)); // 3
		
		System.out.println(iNum1/fNum); //3.3333333
		System.out.println((double)iNum1/fNum); //3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println(ch+0); // 65 == (int)ch
		System.out.println(ch+iNum1); // 75
		System.out.println((char)(ch+iNum1)); // 'K'
	}

}
