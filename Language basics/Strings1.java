import java.util.Scanner;
class Strings1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    if(s1.equals("Wipro") && s2.equals("Bangalore")){
      System.out.println("Wipro Technologies Bangalore");
    }
    if(s1.equals("ABC") && s2.equals("Mumbai")){
      System.out.println("ABC Technologies Mumbai");
    }
  }
}