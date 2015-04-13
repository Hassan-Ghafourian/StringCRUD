package stringcrud;

public class Main {

	public static void main(String[] args) {
		
		String tree = "user0\r\n" + 
				"u0\r\n" + 
				"#%#\r\n" + 
				"user0\r\n" + 
				"u1\r\n" + 
				"#%#\r\n" + 
				"patient0\r\n" + 
				"p0\r\n" + 
				"#%#\r\n" + 
				"patient1\r\n" + 
				"p1\r\n" + 
				"#%#\r\n"
				+ "t\r\n"+ 
				"#%#\r\n";

		
		Row row;
//		System.out.println("[" + StringCRUD.delete(tree,"er0") + "]");
//		
//		String data = "user0" + StringCRUDConstants.FIELD_SEPARATOR + "xUserField1";
//		row = new Row(data);
//		System.out.println("************");
//		System.out.println("[" + StringCRUD.insert(tree,row) + "]");
		
//		System.out.println("************");
//		String[] array = new String[]{"ID","field1","field2","field3"};
//		row = new Row(array);
//		System.out.println("[" + StringCRUD.insert(tree,row) + "]");
		
//		System.out.println(StringArrayUtilities.convertToString(StringUtilities.split(tree, StringCRUDConstants.ROW_SEPARATOR),"&&*&&"));
		row = StringCRUD.query(tree, "et");
		if ("".equals(row.getID())){
			System.out.println("it is empty");
		}
	}

}
