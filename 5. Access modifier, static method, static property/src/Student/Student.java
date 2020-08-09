package Student;

public class Student {
    private int id;
    private String name;
    private String college = "Hawaii";

    Student(int id, String name,String college){
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    void display(){
        System.out.println("số " +this.id + " có tên là: " + this.name +" quê ở: "+ this.college );
    }
}
