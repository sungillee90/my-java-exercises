package fromHackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaInheritanceI {
    class Animal{
        void walk()
        {
            System.out.println("I am walking");
        }
    }
    static class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }
        void sing() {
            System.out.println("I am singing");
        }
    }

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
