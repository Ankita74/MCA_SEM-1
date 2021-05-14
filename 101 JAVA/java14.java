class java14
{
	String name;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
		
	}
	 public static void main(String [] args)
	 {
		 java14 jv = new java14();
		  jv.setName("Ankita");
		  System.out.println("name is:"+ jv.getName());
	 }

}