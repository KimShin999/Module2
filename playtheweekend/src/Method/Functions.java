package Method;

import Entities.Student;

import java.util.ArrayList;

public class Functions {
    ArrayList<Student> students = new ArrayList<>();

    public void add(Student s) {
        students.add(s);
    }

    //why?
    public void remove(int id) {
        Student std = new Student();
        for (Student s : students) {
            if (s.getId() == id) {
                std = s;
            }
        }
        students.remove(std);
    }

    public void update(Student s) {
        for (Student std : students) {
            if (s.getId() == std.getId()) {
                std.setName(s.getName());
                std.setAddress(s.getAddress());
                std.setBirthday(s.getBirthday());
                std.setClassid(s.getClassid());
                std.setEmail(s.getEmail());
                std.setNienkhoa(s.getNienkhoa());
            }
        }
    }

    public void getAll() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public void search(String name) {
//        Student std = new Student();
//
//        for (Student s: students){
//            String ss = s.getName();
//            if (ss.equals(name)){
//                std = s;
//            }
//        }
//        return std;


        for (Student s : students) {
            String ss = s.getName();
            if (ss.equals(name)) {
                System.out.println(s.toString());
            }
        }
    }
}



