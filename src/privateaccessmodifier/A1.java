//If you make any class constructor private, you cannot create the instance of that class from outside the class.
package privateaccessmodifier;
class A1{  
private A1(){}//private constructor  
void msg1(){System.out.println("Hello java");}  
}  