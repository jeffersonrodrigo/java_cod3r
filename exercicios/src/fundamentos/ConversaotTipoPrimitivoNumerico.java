package fundamentos;

public class ConversaotTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		
		float b = (float) 1.12345678888; // conversão explicita (Cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d); // conversão explicita (Cast)
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f); // conversão explicita (Cast)
		
	}
}
