package fromHackerRank;
import java.util.*;

public class JavaPriorityQueue {

    /*
     * Create the Student and Priorities classes here.
     */
    class Student {
        private int token;
        private String firstName;
        private double cgpa;
        public Student(int id, String name, double cgpa) {
            super();
            this.token = id;
            this.firstName = name;
            this.cgpa = cgpa;
        }
        public int getToken() {
            return token;
        }
        public String getName() {
            return firstName;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    class Priorities {
        public List<String> getStudents(List<String> events) {
            PriorityQueue<Student> studentQueue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getToken));
            List<Student> students = new ArrayList<Student>();
            for (String e:events) {
                Scanner sc = new Scanner(e);
                String event = sc.next();
                if (event.equals("ENTER")) {
                    String name = sc.next();
                    float cgpa = sc.nextFloat();
                    int token = sc.nextInt();
                    Student student = new Student(token, name, cgpa);
                    studentQueue.add(student);
                } else if (event.equals("SERVED")) {
                    Student first = studentQueue.poll();
                }
                sc.close();
            }
            Student first = studentQueue.poll();
            if (first == null) {
                return students;
            } else {
                while (first != null) {
                    students.add(first);
                    first = studentQueue.poll();
                }
                return students;
            }
        }
    }



    public class Solution {
        private final static Scanner scan = new Scanner(System.in);
        private final static Priorities priorities = new Priorities();

        public static void main(String[] args) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();

            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st: students) {
                    System.out.println(st.getName());
                }
            }
        }
    }
}
