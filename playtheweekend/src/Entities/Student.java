package Entities;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String classid; //lớp học
    private String nienkhoa; //niên khóa
    private String address;
    private String email;

    public Student(){}

    public Student(int id, String name, String birthday, String classid , String nienkhoa, String address, String email){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classid = classid;
        this.nienkhoa = nienkhoa;
        this.address = address;
        this.email = email;
    }

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id; }

    public String getName(){ return name; }
    public void  setName(String name){ this.name = name; }

    public String getBirthday(){ return this.birthday; }
    public void setBirthday(String birthday){ this.birthday = birthday; }

    public String getClassid(){ return this.classid; }
    public void setClassid(String classid){ this.classid = classid; }

    public String getNienkhoa(){ return this.nienkhoa; }
    public void setNienkhoa(String nienkhoa){ this.nienkhoa = nienkhoa; }

    public String getAddress(){ return this.address; }
    public void setAddress(String address){ this.address = address; }

    public String getEmail(){ return this.email; }
    public void setEmail(String email){ this.email = email; }

    @Override
    public String toString() {
        return "Student{ "+
                " Id: " + this.id +"," +
                " Name: " + this.name +"," +
                " Birthday: " + this.birthday +"," +
                " Class: " +this.classid +"," +
                " Niên Khóa: " +this.nienkhoa +"," +
                " Address: " +this.address +"," +
                " Email: "+ this.email ;
    }
}
