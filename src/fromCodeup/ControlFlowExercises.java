package fromCodeup;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
        ControlFlowExercises run = new ControlFlowExercises();
        run.printFooBar();

        run.reverseCharacters("the cat is fat");
//        // Loop Basics
//
//        // While
//        int i = 5;
//        while(i <= 15) {
//            System.out.println("i before : " + i); // 5,6,7,8,9,10,11,12,13,14,15
//            i++;
////            System.out.println("i after : " + i); // 6,7,8,9,10,11,12,13,14,15,16
//        }
////        System.out.println("i from the outside of while loop: " + i); // 16
//        // Do While
//        // 0 - 100
//        int counter = 0; // initializer
//        do {
//            System.out.println("counter = " + counter);
//            counter += 2;
//        } while(counter <= 100);
//        // 100 - -10
//        int counterB = 100; // initializer
//        do {
//            System.out.println("counterB = " + counterB);
//            counterB -= 5;
//        } while(counterB >= -10);
//        // 2 - sqrt(num)
//        long counterPOW = 2L; // initializer
//        do {
//            System.out.println("counterPOW = " + counterPOW);
//            counterPOW = (long) Math.pow(counterPOW,2);
//        } while(counterPOW < 1000000);
//
//        // Using For loop
//        for (int iforloop = 5; iforloop <= 15; iforloop++) {
//            System.out.println("iforloop: " + iforloop);
//        }
//        for (int countByTwo = 0; countByTwo <= 100; countByTwo = countByTwo+2) {
//            System.out.println("countByTwo using For loop: " + countByTwo);
//        }
//        for (int countBackward = 100; countBackward >= -10; countBackward = countBackward-5) {
//            System.out.println("countBackward = " + countBackward);
//        }
//        for (long countPow = 2L; countPow < 1000000; countPow *= countPow) {
//            System.out.println("countPow = " + countPow);
//        }
//
//        // Fizzbuzz
//        for (int fizzBuzz = 1; fizzBuzz <= 100; fizzBuzz++){
//            if (fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(fizzBuzz % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(fizzBuzz % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(fizzBuzz);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
//        boolean userContinues = true;
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++){
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.print("Would you like to enter another number (y/n)? ");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);

//        boolean gradeSystem = true;
//        do {
//            System.out.println("Enter numerical grade from 0 to 100");
//            int userInput_grade = scanner.nextInt();
//            System.out.println("userInput_grade = " + userInput_grade);
//
//            if (userInput_grade >= 88) {
//                System.out.println("A");
//            } else if (userInput_grade >= 80) {
//                System.out.println("B");
//            } else if (userInput_grade >= 67) {
//                System.out.println("C");
//            } else if (userInput_grade >= 60) {
//                System.out.println("D");
//            } else if (userInput_grade >= 0) {
//                System.out.println("F");
//            }
//            System.out.println("Do tou wish to enter a new grade? [y/n]");
//            String userInput = scanner.next();
//            if (!userInput.equalsIgnoreCase("y")){
//                gradeSystem = false;
//            }
//        } while (gradeSystem);

//        for (int fizzBuzz = 1; fizzBuzz <= 100; fizzBuzz++){
//            if (fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(fizzBuzz % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(fizzBuzz % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(fizzBuzz);
//            }
//        }


//        for (int f1 = 1; f1 <= 100; f1++){
//            if (f1 % 6 == 0) {
//                System.out.println("baz");
//            } else if(f1 % 2 == 0) {
//                System.out.println("foo");
//            } else if(f1 % 3 == 0) {
//                System.out.println("bar");
//            } else {
//                System.out.println(f1);
//            }
//        }

    }

//    public static void printFooBar() {
//        for (int f1 = 1; f1 <= 100; f1++){
//            if (f1 % 2 == 0 && f1 % 6 == 0) {
//                System.out.println("baz");
//            } else if(f1 % 2 == 0) {
//                System.out.println("foo");
//            } else if(f1 % 3 == 0) {
//                System.out.println("bar");
//            } else {
//                System.out.println(f1);
//            }
//        }
//    }
    public void printFooBar() {
        for (int f1 = 1; f1 <= 100; f1++){
            if (f1 % 6 == 0 && f1 % 2 == 0) {
                System.out.println("baz");
            } else if(f1 % 2 == 0) {
                System.out.println("foo");
            } else if(f1 % 3 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(f1);
            }
        }
    }
    public String reverseCharacters(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String input: ");

        String inputSC = sc.nextLine();

        // First Method
//        StringBuilder inputSC1 = new StringBuilder();
//
//        inputSC1.append(inputSC);
//
//        inputSC1 = inputSC1.reverse();
//
//        System.out.println(inputSC1);
//        return String.valueOf(inputSC1);
        // SOLN
        StringBuilder reverseInputSC1 = new StringBuilder();
        String[] words = inputSC.split(" ");
        for (String word : words)
        {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseInputSC1.append(reverseWord + " ");
        }
        System.out.println(reverseInputSC1.toString().trim());

        return (reverseInputSC1.toString().trim());

//        char[] hello = input.toCharArray();
//        List<Character> al = new ArrayList<>();
//        for (char c: hello)
//            al.add(c);
//
//        Collections.reverse(al);
//
//        ListIterator li = al.listIterator();
//        while(li.hasNext())
//            System.out.println(li.next());
//
//        return String.valueOf(al);

//        al = Arrays.asList(str);
//        for (String s: al) {
//            System.out.println(s);
//        }
//        for (int i = al.size(); i >= 0; i--) {
//
//            reverseCharacters(al.toString());
//        }
//
//        Collections.reverse(al);
//
////        String stringB = new StringBuilder(inputSC).toString();
////
////
//        return String.valueOf(al);

    }
//    public static ArrayList printElements(ArrayList<Integer> alist)
//    {
//        for (int i = 0; i < alist.size(); i++) {
//            System.out.print(alist.get(i) + " ");
//        }
//    }

//    public Node balancedTree(ArrayList<Integer> inputList) {
//        int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
//        int n = arr.length;
//    }
//    class Node {
//
//        int data;
//        Node left, right;
//
//        Node(int d) {
//            data = d;
//            left = right = null;
//        }
//    }
//
//    class BinaryTree {
//
//        static Node root;
//
//        Node sortedArrayToBST(int arr[], int start, int end) {
//
//        /* Base Case */
//        if (start > end) {
//            return null;
//        }
//
//        /* Get the middle element and make it root */
//        int mid = (start + end) / 2;
//        Node node = new Node(arr[mid]);
//
//        /* Recursively construct the left subtree and make it
//         left child of root */
//        node.left = sortedArrayToBST(arr, start, mid - 1);
//
//        /* Recursively construct the right subtree and make it
//         right child of root */
//        node.right = sortedArrayToBST(arr, mid + 1, end);
//
//        return node;
//    }
static class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

    static class BinaryTree {

        static Node root;

        /* A function that constructs Balanced Binary Search Tree
         from a sorted array */
        Node sortedArrayToBST(int arr[], int start, int end) {

            /* Base Case */
            if (start > end) {
                return null;
            }

            /* Get the middle element and make it root */
            int mid = (start + end) / 2;
            Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make it
         left child of root */
            node.left = sortedArrayToBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
            node.right = sortedArrayToBST(arr, mid + 1, end);

            return node;
        }

        /* A utility function to print preorder traversal of BST */
        void preOrder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
            int n = arr.length;
            root = tree.sortedArrayToBST(arr, 0, n - 1);
            System.out.println("Preorder traversal of constructed BST");
            tree.preOrder(root);
        }

    }




}
