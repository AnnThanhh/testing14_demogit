package bai_tap.buoi_5.quan_ly_nhan_vien;

import java.util.Scanner;

//đóng gói nhân viên
public class nhanVien {
    // thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHours;
    private double totalWorkingHours;
    //constructor
    public nhanVien(String id, String name, int age, String address, double salaryPerHours, double totalWorkingHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerHours = salaryPerHours;
        this.totalWorkingHours = totalWorkingHours;
    }
    //phương thức
    public double calculateSalary(){
        return salaryPerHours * totalWorkingHours;
    }

    public void displayInfo(){
        System.out.println("ID: " + id
                + " | Tên: " + name
                + " | Tuổi: " + age
                + " | Địa chỉ: " + address
                + " | Lương/giờ: " + salaryPerHours
                + " | Giờ làm: " + totalWorkingHours
        + " | Tổng lương: " + calculateSalary());
    }

    public String getId() {
        return id;
    }

    public double getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public String getName (){
        return name;
    }
}
