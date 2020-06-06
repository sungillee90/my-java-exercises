package fromCodeup;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics

        // While
        int i = 5;
        while(i <= 15) {
            System.out.println("i before : " + i); // 5,6,7,8,9,10,11,12,13,14,15
            i++;
            System.out.println("i after : " + i); // 6,7,8,9,10,11,12,13,14,15,16
        }
        System.out.println("i from the outside of while loop: " + i); // 16
    }
}
