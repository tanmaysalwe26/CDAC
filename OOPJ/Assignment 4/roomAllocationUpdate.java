class roomAllocationUpdate{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		String og = new String(" 101");
		String insert = new String("New Building ");
		int i=0;
		
		sb.insert(i,insert).insert(12,og);
		System.out.println(sb);
	}
}