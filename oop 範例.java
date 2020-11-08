class Island{
   public void m(){
      System.out.println(" is island");
   }
}
 


public class TestDog{
  public static void main(String args[]){
     Island java = new Island(); 
     Island taiwan = new Island(); 
     System.out.print("taiwan");
     taiwan.m(); 
System.out.println(""); 
     System.out.print("java"); 
     java.m();
  }
 }