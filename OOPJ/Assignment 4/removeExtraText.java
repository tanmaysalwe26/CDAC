class removeExtraText{
	public static void main(String args[]){	
	StringBuilder sb = new StringBuilder("Please read - Do not disturb");
	String remove = new String("- Do not disturb");
	int start = sb.indexOf(remove);
	int end = start + remove.length();
	
	sb.delete(start,end);
	System.out.println(sb);
}}
