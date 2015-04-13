package stringcrud;

public class StringCRUD {

	public static Row query(final String tree, final String rowID) {
		String str = "";
		String searchPhrase = rowID + StringCRUDConstants.FIELD_SEPARATOR;
		int offsetIndex;
		int lastIndex;

		if (tree.startsWith(searchPhrase)) {
			offsetIndex = 0;
			lastIndex = tree.indexOf(StringCRUDConstants.ROW_SEPARATOR,
					offsetIndex);
			if (lastIndex != -1) {
				str = tree.substring(offsetIndex, lastIndex).trim();
			}
		} else {
			searchPhrase = StringCRUDConstants.ROW_SEPARATOR + searchPhrase;
			offsetIndex = tree.indexOf(searchPhrase);
			if (offsetIndex != -1) {
				offsetIndex = offsetIndex
						+ StringCRUDConstants.ROW_SEPARATOR.length();
				lastIndex = tree.indexOf(StringCRUDConstants.ROW_SEPARATOR,
						offsetIndex);
				if (lastIndex != -1) {
					str = tree.substring(offsetIndex, lastIndex).trim();
				}
			}
		}

		return new Row(str);
	}

	public static String delete(final String tree, final String rowID) {
		String str = tree;
		Row row = query(str, rowID);
			while (!"".equals(row.getData())) {
				str = str.replace(row.getData()
						+ StringCRUDConstants.ROW_SEPARATOR, "");
				row = query(str, rowID);
			}
		return str;
	}

	public static String insert(final String tree, final Row row)
			throws IllegalArgumentException {
		String rowID = row.getID();
		if ("".equals(rowID)) {
			throw new IllegalArgumentException("row must have ID.");
		}
		String str = delete(tree, rowID);
		str = str + row.getData() + StringCRUDConstants.ROW_SEPARATOR;
		return str;
	}

}
