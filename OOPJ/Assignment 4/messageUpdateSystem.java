class  messageUpdateSystem{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Old Notice");
		String find = "Old";
		String updated="Updated";
		
		int start= sb.indexOf(find);
		int end = start + find.length();
		
		sb.replace(start,end,updated);
		System.out.println(sb);
	}
}