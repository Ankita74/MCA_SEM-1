
import java.util.logging.*; 

public class GfG 
{ 
	
    public static void main(String[] args) 
    { 
        DemoLogger obj = DemoLogger.getInstance("Hello , this my log msg"); 
		System.out.println(obj.getMsg());
		thread();
    
    } 

	public static void thread()
	{
		 Thread t1 = new Thread(new Runnable()
		 {
			 public void run()
			 {
				LogManager lgmngr = LogManager.getLogManager(); 
			  
				Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
			  
				log.log(Level.INFO, "This is a log message"); 
  
			 }
		 });
		 t1.start();
	}
}
