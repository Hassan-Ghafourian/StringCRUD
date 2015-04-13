package stringcrud;

public class Row {
	private final String[] fields;

	Row(String data) {
		this.fields = StringUtilities.split(data,
				StringCRUDConstants.FIELD_SEPARATOR);
	}

	public Row(String[] fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "Row ; fileds >> ["
				+ StringArrayUtilities.convertToString(fields,
						StringCRUDConstants.FIELD_SEPARATOR + "]");
	}

	public String getID() {
		return fields[0].trim();
	}

	public String getField(final int fieldIndex) {
		return fields[fieldIndex].trim();
	}

	public String getData() {
		return StringArrayUtilities.convertToString(fields,
				StringCRUDConstants.FIELD_SEPARATOR);
	}

}
