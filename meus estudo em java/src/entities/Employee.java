package entities;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }



    public void increaseSalary(Double percentage) {
        this.setSalary(this.getSalary() + this.getSalary() * percentage / 100.0);

    }

    public Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
        
    }

    public Boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    @Override
    public String toString() {
        return this.getId() + ", " + this.getName() + ", " + String.format("%.2f", this.getSalary());
    }

    

    
}
