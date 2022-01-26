public class Main  {
   public static void main(String args[]){
      Java8Tester tester = new Java8Tester();
        
      MathOperation plus = (int a, int b) -> a + b;
      MathOperation minus = (a, b) -> a - b;
      MathOperation mul = (int a, int b) -> { return a * b; };
      MathOperation div = (int a, int b) -> a / b;
      
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);

      System.out.println( tester.operate(2, 5, plus));
      System.out.println( tester.operate(10, 3, minus));
      System.out.println( tester.operate(4, 2, mul));
      System.out.println( tester.operate(30, 6, div));
        
      greetService2.sayMessage("Google");
   }  
}
