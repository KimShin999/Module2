package OjecT;

import Service.Service;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Service {
    private int numberPhone;
    private String name;
    private String position;
    private String address;
    private String dateOfBirth;
    private String typeOfContract;

    public Employee(){}

    public Employee(String name, int numberPhone, String dateOfBirth,  String position,  String address, String typeOfContract){
        this.name = name;
        this.position =position;
        this.numberPhone = numberPhone;
        this.address = address;
        this.typeOfContract = typeOfContract;
        this.dateOfBirth = dateOfBirth;
    }

    List<Employee> employees = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void add(Object o) {
        Employee e = (Employee) o;
        employees.add(e);
    }

    @Override
    public void update(Object o) {
        Employee e = (Employee) o;
        for (Employee employee : employees) {
            if (e.getNumberPhone() == employee.getNumberPhone()){
                employee.setNumberPhone(e.getNumberPhone());
                employee.setName(e.getName());
                employee.setAddress(e.getAddress());
                employee.setPosition(e.getPosition());
                employee.setTypeOfContract(e.getTypeOfContract());
                employee.setDateOfBirth(e.getDateOfBirth());
            }
        }
    }

    @Override
    public void getAll() {
        for (Employee employee: employees){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void remove(int numberPhone) {
        Employee e = new Employee();
        for (Employee employee : employees){
            if (numberPhone == employee.getNumberPhone()){
                e =employee;
            }
        }
        employees.remove(e);
    }

    @Override
    public void search(int numberphone) {
        for (Employee employee : employees){
            if (numberphone == employee.getNumberPhone()){
                System.out.println(employee);
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{ "+
                " Name: " + getName() +"," +
                " NumberPhone: " + getNumberPhone() +"," +
                " DateOfBirth: " +getDateOfBirth() +"," +
                " Position: " + getPosition() +"," +
                " Contract: " + getTypeOfContract() +"," +
                " Address: " +getAddress() + "}";
    }
}
