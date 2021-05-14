

public class Singleton {

   
    public static void main(String[] args) {
      
        GVVC mygvvc = GVVC.getInstance("Prof. Anamik Shah");
        mygvvc.setAge(65);
       
         GVVC mygvvc1 = GVVC.getInstance("Prof. Shah");
         GVVC mygvvc1 = mygvvc;
         GVVC mygvvc2 = mygvvc;
         mygvvc1.setAge(60);
         System.out.println(mygvvc.getVC());
         System.out.println(mygvvc1.getVC());
         mygvvc2.setAge(56);
         System.out.println(mygvvc2.getVC());

      /* PrintSpooler ps = PrintSpooler.getInstance();
       ps.setMessage("First message");
       ps.print("Mr. Ajay");
       PrintSpooler ps1 = PrintSpooler.getInstance();
       ps1.setMessage("Second Message");
       ps1.print("Mr Ramesh");
       ps.print("Mr Kamal");
       ps.setMessage("XYZ");
       ps1.print("Prifix ps1");
       ps.print("prefixps ");*/
       
  
    }
    
}
