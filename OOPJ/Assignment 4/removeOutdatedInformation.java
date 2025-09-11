class removeOutdatedInformation{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("CDAC Kharghar 2024");
		String del = new String("2024");
		
		int start = sb.indexOf(del);
		int end = start + del.length();
		
		
		sb.delete(start,end);
		System.out.println(sb);
	}
}