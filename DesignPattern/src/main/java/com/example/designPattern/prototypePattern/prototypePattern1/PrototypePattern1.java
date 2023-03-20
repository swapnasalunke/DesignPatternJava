package com.example.designPattern.prototypePattern.prototypePattern1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface Prototype {
    public Prototype getClone();
}


class EmployeeRecord implements Prototype{
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(){
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------\n\n");
    }

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public Prototype getClone() {

        return new EmployeeRecord(id,name,designation,salary,address);
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}


class PrototypePattern1{

    public static void main(String[] args) throws IOException {


        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eId=Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name: ");
        String eName=br.readLine();

        System.out.print("Enter Employee Designation: ");
        String designation=br.readLine();

        System.out.print("Enter Employee Address: ");
        String address=br.readLine();

        System.out.print("Enter Employee Salary: ");
        double salary= Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1=new EmployeeRecord(eId,eName,designation,salary,address);

        System.out.println(e1);
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        System.out.println(e2);

    }
}

