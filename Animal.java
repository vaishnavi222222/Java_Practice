class Animals{
    public void eat(){
        System.out.println("Animal eats food");
    }
    public void sleep(){
        System.out.println("Animal sleeps in night");
    }
}

class Child extends Animal{
    public void eat(){
        System.out.println("Child Animal eats food");
    }
    public void sleep(){
        System.out.println("Child Animal also sleeps in night");
    }
    public void fly(){
        System.out.println("Child animal can also fly");
    }
}

class Animal{
    public static void main(String...args){
        Animals a = new Animals();
        a.eat();
        a.sleep();

        Child b = new Child();
        b.eat();
        b.sleep();
        b.fly();
    }
}