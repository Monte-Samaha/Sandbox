
public class Runner {

	// test out 10/8 want 1 remainder 2
	public static void main(String[] args) {

		int numberBits = 10;
		int bite = 8; //spelled wrong to avoid a keyword conflict
		int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;
		
		byteAnswer = numberBits / bite;
		byteRemainder = numberBits % 8;
		
		System.out.println("bits = " + numberBits + " bytes = "
		+ byteAnswer + " remainder = " + byteRemainder);

	}
}
