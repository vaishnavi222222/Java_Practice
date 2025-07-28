import java.util.*;
class ArrayListDemo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> al = new ArrayList<>();
    System.out.println("Enter no of test cases:");
    int t = sc.nextInt();
    while(t-- > 0){
      System.out.println("Enter length of list:");
      int N = sc.nextInt();
      ArrayList<Integer> ar = new ArrayList<>();
      while(N-- > 0){
        System.out.println("Enter elements of list:");
        int m = sc.nextInt();
        ar.add(m);
      }
    }
    System.out.println("Enter no of Quiers:");
    int q = sc.nextInt();
    while(q-- > 0){
      System.out.println("enter x value:");
      int x = sc.nextInt();
      System.out.println("enter y value:");
      int y = sc.nextInt();
      if(x-1 < t && y-1 <= al.get(x-1).get(y-1)) System.out.println(al.get(x-1).get(y-1));
      else System.out.println("-1");
      }
    }
}
  