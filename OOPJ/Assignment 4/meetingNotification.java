class meetingNotification{
	public static void main(String args[]){
		String base = new String("Meeting: ");
		StringBuilder sb = new StringBuilder();
		String append = new String(" Friday at 5 PM");
		
		sb.insert(0,base).insert(8,append);
		System.out.println(sb);
	}
}