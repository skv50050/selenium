package abstractclass1;
//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike1{  
   Bike1(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  