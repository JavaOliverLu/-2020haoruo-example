public class Test {
   public static void main(String args[]){
      
      char grade = 'B';
 
      switch(grade)
      {
         case 'A' :
            System.out.println("good"); 
            break;
         case 'B' :
            System.out.println("ok");
            break;
         case 'C' :
            System.out.println("要加油");
            break;
         default :
            System.out.println("你缺考");
      }
      System.out.println("會考單科成績= " + grade);
   }
}