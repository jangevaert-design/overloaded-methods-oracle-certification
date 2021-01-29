package edu.cnm.deepdive;

public class OverloadingMethods {

  public void walk(int miles) {}
//  public int walk(int miles) {will not compile because it is the same method with the same
  //parameter even though there is a return type in this method.
//    return miles;
//  }

  public void walk(short feet) {}
//  public int walk(short step) {}will not compile because the parameter type is the same.

  public boolean walk() {
    return false;
  }
  void walk(int miles, short feet) {}

  public void walk(int[] lengths) {}
//  public void walk (int...varargs) {} will not compile because varargs are treated similar
//  as arrays.




  public static void main(String[] args) {
    //Arrays.toString();is an example of an overloaded method because you can pass in ints, Objects,
    //booleans,...
//    run(1); //will go for the method with int.
//    run(1.0) // will call the method with parameter double.
//    run(9L); // will compile because long will be promoted to a bigger type and call double.

    jump("test");//since this is a string the method with String will be called.
    jump(25);//looks for a method with int (not to be found); will look for a larger primitive than
    //int (not to be found); will autobox int to Int and look for an Integer object (not to be found),
    //will go for Object.

//    sum(1, 2);will call the int method.
// in case the int method wasn't there, this call would go to the method with the long return type.
// in case there is no int and no long method below, the Integer method would be called because the
// int will be autoboxed to Integer.
// Lastly, in case no int, no long and no Integer method, the varargs method will be called.
  }

  public static void run(int length) {}
  public static void run(Integer length) {}
  public static void run(double kilometers) {}

  public static void jump(String s) {
    System.out.println("string");
  }
  public static void jump(Object o) {
    System.out.println("object");
  }

  public static int sum(int a, int b) {
    System.out.println("int sum");
    return a + b;
  }
  public static long sum(long a, long b) {
    System.out.println("long sum");
    return a + b;
  }
  public static Integer sum(Integer a, Integer b) {
    System.out.println("Integer sum");
    return a + b;
  }
  public static int sum(int...numbers) {
    System.out.println("sum var args");
    int sum = 0;
    for (int i : numbers) {
      sum += i;
    }
    return sum;
  }

}
