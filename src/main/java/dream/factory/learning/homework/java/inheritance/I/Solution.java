package dream.factory.learning.homework.java.inheritance.I;


class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    //here's the solution
    void sing(){
        System.out.println("I am singing");
    }
}
public class Solution{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}