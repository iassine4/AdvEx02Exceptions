
public class FoundException {

	public static void main(String[] args) {
		
		System.out.println("Instruction 1");

		try {
		    int result = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getClass());
		}

		System.out.println("Instruction 2");
	}

}
