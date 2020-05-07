
public class Concat {
	public static void main(String[] args) {
		String [] arr = {"Elemento1", "Elemento2", "Elemento3"};
		String result = concat(arr);
		System.out.println(result);
	}
	private static String concat(String[] arr) {
	    String cad = "";
	    for (int i = 0; i < arr.length; i++) {
	        if (i > 0) {
	            cad += ", ";
	        }
	        cad += arr[i];
	    }
	    return cad;
	}
}
