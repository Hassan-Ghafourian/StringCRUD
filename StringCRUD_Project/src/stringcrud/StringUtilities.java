package stringcrud;

public class StringUtilities {
	/**
	 * here <b><i> separator </i></b> is not a regex.
	 * @param data
	 * @param separator
	 * @return
	 */
	public static String[] split(final String data, final String separator){
		String str = separator + data + separator;
		int count = countOccurrences(str, separator);
		String[] array = new String[count - 1];
		int start = separator.length();
		int end;
		for (int i = 0; i < array.length; i++){
			end = str.indexOf(separator, start);
			array[i] = str.substring(start, end);
			start = end + separator.length();
		}
		return array;
	}
	
	public static int countOccurrences(String haystack, String needle) {
		int i = haystack.indexOf(needle);
		int counter = 0;
		while (i >= 0) {
			counter++;
			i = haystack.indexOf(needle, i + 1);
		}
		return counter;
	}
}
