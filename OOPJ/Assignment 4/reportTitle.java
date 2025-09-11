class reportTitle {
	public static void main(String args[]){
		
		String originalTitle = "Annual Report";
        String departmentName = " CDAC";
		
		StringBuilder sb = new StringBuilder();
		sb.insert(0,originalTitle).insert(6,departmentName);
		System.out.println(sb);
	}
}