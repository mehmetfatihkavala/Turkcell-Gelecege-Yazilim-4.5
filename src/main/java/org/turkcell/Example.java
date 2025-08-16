package org.turkcell;

public class Example {
    public static void main(String[] args) {
        Employee emp = new Employee("Mehmet Fatih","KAVALA","21",2121,"Yazılım");

        Employee emp1 = new Employee();
        emp1.setFirstName("Me");
        //emp1.setFirstName("Mehmet Fatih");
        System.out.println(emp1.getFirstName());
    }
}
