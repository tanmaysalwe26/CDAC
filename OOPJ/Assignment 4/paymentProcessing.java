class paymentProcessing{
	public static void main(String args[]){
		try{
			throw new Exception("Payment failed");
		}catch(Exception e){
			System.out.println("Exception occurred: "+e.getMessage());
		}
		finally{
			System.out.println("Cleanup done");
		}
	}
}