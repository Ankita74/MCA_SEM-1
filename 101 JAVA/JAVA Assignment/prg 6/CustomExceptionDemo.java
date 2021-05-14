 class CustomExceptionDemo{  
    
    	public static void main(String args[]){  
    	try{
    	
	    	for(String str:args)
	    	{
	    		int argument = Integer.parseInt(str);
	    		System.out.println("Your argument is: " + argument);  
	    		if(argument < 0)
	    		{
	    		throw new CustomException("Negative argument..!!!");		
	    		}
	    	} 	
    	}catch(CustomException ce){
    		
    		System.out.println(ce.getMessage());
    	}
    }    
}  
class CustomException extends Exception {

	private String message;
 
    	public CustomException(String msg)
    	{
        	this.message = msg;
    	}
    	
	public String getMessage() 
	{
        	return message;
   	 }


}

