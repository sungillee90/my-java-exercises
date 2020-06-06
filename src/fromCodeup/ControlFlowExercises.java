package fromCodeup;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics

        // While
        int i = 5;
        while(i <= 15) {
            System.out.println("i before : " + i); // 5,6,7,8,9,10,11,12,13,14,15
            i++;
//            System.out.println("i after : " + i); // 6,7,8,9,10,11,12,13,14,15,16
        }
//        System.out.println("i from the outside of while loop: " + i); // 16
        // Do While
        // 0 - 100
        int counter = 0; // initializer
        do {
            System.out.println("counter = " + counter);
            counter += 2;
        } while(counter <= 100);
        // 100 - -10
        int counterB = 100; // initializer
        do {
            System.out.println("counterB = " + counterB);
            counterB -= 5;
        } while(counterB >= -10);
        // 2 - sqrt(num)
        long counterPOW = 2L; // initializer
        do {
            System.out.println("counterPOW = " + counterPOW);
            counterPOW = (long) Math.pow(counterPOW,2);
        } while(counterPOW < 1000000);

        // Using For loop
        for (int iforloop = 5; iforloop <= 15; iforloop++) {
            System.out.println("iforloop: " + iforloop);
        }
        for (int countByTwo = 0; countByTwo <= 100; countByTwo = countByTwo+2) {
            System.out.println("countByTwo using For loop: " + countByTwo);
        }
        for (int countBackward = 100; countBackward >= -10; countBackward = countBackward-5) {
            System.out.println("countBackward = " + countBackward);
        }
        for (long countPow = 2L; countPow < 1000000; countPow *= countPow) {
            System.out.println("countPow = " + countPow);
        }

    }
}
