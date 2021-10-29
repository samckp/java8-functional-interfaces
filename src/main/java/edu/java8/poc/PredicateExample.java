package edu.java8.poc;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Address{
    int id;
    String city;

    public Address(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Emp{

    String name;
    double salary;
    Address address;

    public Emp(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> pr = str -> str.length() > 5;

        System.out.println(pr.test("Teste1"));

        Predicate<Integer> num = n -> n%2==0;
        System.out.println(num.test(50));

        ///Employee salary > 5000;
        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Raj", 4050, new Address(1, "Pune")));
        emps.add(new Emp("Pom", 2150, new Address(2, "BBSR")));
        emps.add(new Emp("Tony", 3050, new Address(3, "Hyd")));
        emps.add(new Emp("Wamy", 8050, new Address(4, "BLR")));
        emps.add(new Emp("Ega", 7050, new Address(5, "JSR")));

        Predicate<Emp> salGrtr5k = e ->e.salary <5000;
        Predicate<Emp> nameGrtr4Char = e1 -> e1.name.length() > 3;

//         emps.stream().sorted(Comparator.comparingInt(Emp::getName))
        for(Emp emp : emps) {

            if(salGrtr5k.test(emp)) {
                System.out.println(emp.name + " >> " + emp.salary);
            }
            if(nameGrtr4Char.test(emp)) {
                 System.out.println(emp.name + " :: " + emp.salary);
            }
        }




        System.out.println("Predicate join example");
        ///// Predicate join example
        int[] nums = {3,5,7,8,9,11,65,33,23,12};
        Predicate<Integer> even = evn -> evn%2 ==0;
        Predicate<Integer> gtrTen = n -> n >10;

        for(int i : nums){

            if(even.and(gtrTen).test(i)){
                System.out.println(i);
            }

            if(even.or(gtrTen).test(i)){
                System.out.println(i);
            }
            if(even.negate().test(i)){
                System.out.println(i);
            }
        }

    }
}
