package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("JavaKing", 1, 1));
        list.add(new Student("CSharpKing", 1, 2));
        list.add(new Student("PythonQueen", 1, 3));

        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println("s.name = " + s.name);
        }
    }

    static class Student {
        String name = "";
        int ban;
        int no;

        Student(String name, int ban, int no) {
            this.name = name;
            this.ban = ban;
            this.no = no;
        }

    }
}
