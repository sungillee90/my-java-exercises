package fromCodeup;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 76;
        System.out.println("myFavoriteNumber = " + myFavoriteNumber);
        
        String myString = "This is my example of string value";
        System.out.println("myString = " + myString);
        myString = "3.14159";
        System.out.println("myString = " + myString);
        long myNumber = 123L;
        System.out.println("myNumber = " + myNumber);

        float myNumber1 = 3.14f;
        System.out.println("myNumber = " + myNumber1);
        double myNumber2 = 3.14;
        System.out.println("myNumber2 = " + myNumber2);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        String theNumberThree = "three";    // three
        Object o = theNumberThree;      // three

        System.out.println("theNumberThree = " + theNumberThree);
        System.out.println("o = " + o);

        int xy = 4;
        xy += 5;


    }

}