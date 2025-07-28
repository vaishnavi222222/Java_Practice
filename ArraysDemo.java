import java.util.*;
class ArraysDemo{
  public static void main(String[] args) {
    String [] s1 = {"int","float","double","char"};
    String [] s2 = {"int","float","double","char"};
    int[] a1 = {1,2,3,4,5,6,7};
    int[] a2 = {1,2,3,4,5,6,7};
    char[] c = {'a','b','c','d','e'};
    
      // sorts the array
      Arrays.sort(s);
      for(String i : s){
          System.out.println(i);
      }
      
      // sorts the array from particular start index to particular end index
      Arrays.sort(s,0,2);
      for(String i : s){
          System.out.println(i);
      }
      
    //sort the array in decresing order
    Arrays.sort(s, (a, b) -> b.compareTo(a));
    for(String i : s){
      System.out.println(i);
    }
        
    //serching
    if(Arrays.binarySearch(a, 7)< 0) System.out.println("Value is not found");
    else System.out.println(Arrays.binarySearch(a,7));

    //Comparison
    System.out.println(Arrays.equals(a1,a2));
    String[][] sr ={{"one,two"},{"three"}};
    String[][] sr1 ={{"one,two"},{"three"}};
    System.out.println(Arrays.deepEquals(sr, sr1));


    // conversion
    List<String> ss = new ArrayList<>();
    ss.addAll(Arrays.asList(s1));
    System.out.println(ss);

    Arrays.fill(a1,4);
    for(int i:a1){
      System.out.print(i);
    }
    
    //clone the array values(Making the copy)
    int[] cs = Arrays.copyOf(a1, 10);
    for(int i:cs){
      System.out.println(i);
    }
    // clone the array in particular range
    int[] cp = Arrays.copyOfRange(a1, 0,3);
    for(int i:cp){
      System.out.println(i);
    }



  }
}