class Animal {
  void eat() {
    System.out.println("animal : eat");
  }
}
 
class Dog extends Animal {
  void eat() {
    System.out.println("dog : eat");
  }
  void eatTest() {
    this.eat();   
    super.eat(); 
  }
}
 class Panda extends Animal {
  void eat() {
    System.out.println("panda is a kind of animal which send your food");
  }
  void eatTest() {
    this.eat();   
    super.eat(); 
  }
}
public class Test {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    Dog d = new Dog();
    d.eatTest();
Panda food=new Panda();
food.eatTest();
  }
}



