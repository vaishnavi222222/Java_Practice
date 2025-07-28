abstract class A {
  abstract public void print();
  abstract public int printa(int a,int b);
  public  void sub(int a , int b){
    System.out.println(a-b);
  }
}

abstract class B extends A{
  public void print(){
    System.out.println();
  }
  public void div(int a, int b){
    System.out.println(a/b);
  }
  public static void main(String[] args) {
    B b = new B();
    b.print();
  }
}





