package bai_tap.buoi_5;

import java.util.Scanner;

public class baitap_buoi5 {
    public static void main(String[] args) {
        // bài tập quản lý sinh viên thông qua menu có 4 chức năng chính
        // 1. thêm sinh viên,
        // 2. xóa sinh viên dựa vào id
        // 3. hiển thị danh sách sinh viên
        // 4.tìm sinh viên theo id
        // 5. thoát chương trình
        // mỗi sinh viên sẽ có các thuộc tính: id, name, age, address

        // 1. tạo class Sinh Viên
        // 2. tạo class Quản lý sinh viên để thực hiện các chức năng
        // 3. tạo menu để người dùng lựa chọn chức năng

        //tạo ra menu
        Scanner sc = new Scanner(System.in);
        quanLySinhVien quanLySinhVien = new quanLySinhVien();
        int choice;
        do{
        System.out.println("===== QUẢN LÝ SINH VIÊN =====");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo id");
        System.out.println("4. Xóa sinh viên theo id");
        System.out.println("5. Thoát chương trình");
        System.out.println("==============================");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();
        sc.nextLine(); // để đọc bỏ dòng mới sau khi nhập choice
        switch (choice){
            case 1:
                quanLySinhVien.themSinhVien(sc);
                break;
            case 2:
                quanLySinhVien.hienThiDanhSachSinhVien();
                break;
            case 3:
                quanLySinhVien.timSinhVien(sc);
                break;
            case 4:
                quanLySinhVien.xoaSinhVien(sc);
                break;
            case 5:
                System.out.println("Thoát chương trình thành công!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
        }} while (choice != 5);
    }
}
