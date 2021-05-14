import java.util.logging.*; 
  
public class DemoLogger 
{ 
	String msg;
	public static DemoLogger dm;

	private DemoLogger(String msg)
	{
		this.msg=msg;
	}
	
    public String getMsg() 
    { 
        return msg;
  
    } 
	public static DemoLogger getInstance(String msg)
	{
		 if (dm == null )
        {
            dm =  new DemoLogger(msg);
			
        }
           return dm;
		  
	}
} 