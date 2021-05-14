public class AccountMaker {
   private BankAccount BoB;
   private BankAccount DenaBank;
   private BankAccount Icici;

   public AccountMaker() {
      BoB = new BoB();
      DenaBank = new DenaBank();
      Icici = new Icici();
   }

   public void createBob(){
      BoB.Create();
   }
   public void createDenaBank(){
      DenaBank.Create();
   }
   public void createIcici(){
      Icici.Create();
   }
}