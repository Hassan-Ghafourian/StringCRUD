package stringcrud;

public class StringArrayUtilities {
	public static String convertToString(String[] array,String separator){
		String elementSeparator = "";
		StringBuilder builder = new StringBuilder();
		for(String s : array) {
		    builder.append(elementSeparator).append(s);
		    elementSeparator = separator;
		}
		return builder.toString();
	}
}
