package bai_tap.buoi_5.quan_ly_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLyNhanVien {
    //thuộc tính
    private ArrayList<nhanVien> danhSachNhanVien = new ArrayList<>();
    //-> [nhanVien, nhanVien, nhanVien]
    //phương thức
    //1. thêm nhân viên
    public void themNhanVien(Scanner sc){
        System.out.println("Nhập ID nhân viên");
        String id = sc.nextLine();

        // kiểm tra id đã tồn tại hay chưa
        //nếu khác null tức là đã tồn tại thì không cho thêm
        if(timNhanVienTheoId(id) != null){
            System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
            return; // dừng phương thức nếu ID đã tồn tại
        }
        //nếu chưa tồn tại thì thêm mới
        System.out.println("Nhập name: ");
        String name = sc.nextLine();
        System.out.println("Nhập age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập address: ");
        String address = sc.nextLine();
        System.out.println("Nhập salaryPerHours: ");
        double salaryPerHours = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập totalWorkingHours: ");
        double totalWorkingHours = Double.parseDouble(sc.nextLine());
        nhanVien nv = new nhanVien(id, name, age, address, salaryPerHours, totalWorkingHours);
        danhSachNhanVien.add(nv);
        System.out.println("thêm nhân viên thành công");
    }

    //2. hiển thị danh sách nhân viên
    public void hienThiDanhSachNhanVien(){
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }

        for (nhanVien nv : danhSachNhanVien) {
            nv.displayInfo();
        }
    }
    //3. xóa nhân viên dựa vào id
    public void xoaNhanVienTheoId(Scanner sc){
        System.out.println("Nhập ID nhân viên cần xóa: ");
        String id = sc.nextLine();
        //đặt cờ hiệu: là chưa tìm thấy = false
        boolean found = false;
        for (nhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                danhSachNhanVien.remove(nv);
                System.out.println("Xóa nhân viên thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
        }
    }

    //4. tìm kiếm nhân viên dựa vào id
    public void timKiemNhanVienTheoId(Scanner sc){
        System.out.println("Nhập ID nhân viên cần tìm kiếm: ");
        String id = sc.nextLine();
        //đặt cờ hiệu: là chưa tìm thấy = false
        boolean found = false;
        for (nhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                nv.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
        }
    }
    //tìm nhân viên theo id
    public nhanVien timNhanVienTheoId(String id){
        for (nhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                return nv; // trả về nhân viên nếu tìm thấy
            }
        }
        return null; // trả về null nếu không tìm thấy
    }

    //5. tìm nhân viên có tổng lương cao nhất
    public void timNhanVienCoTongLuongCaoNhat(){
        // kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }
        nhanVien maxNV = danhSachNhanVien.get(0);

        // tìm kiếm
        for(nhanVien nv : danhSachNhanVien){
            if(nv.calculateSalary() > maxNV.calculateSalary()){
                maxNV = nv;
            };
        }
        System.out.println("Nhân viên có tổng lương cao nhất:");
        maxNV.displayInfo();
    }
    //6. tìm nhân viên có số giờ làm thấp nhất
    public void timNhanVienCoSoGioLamThapNhat(){
        // kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }
        nhanVien minNV = danhSachNhanVien.get(0);

        // tìm kiếm
        for(nhanVien nv : danhSachNhanVien){
            if(nv.getTotalWorkingHours() < minNV.getTotalWorkingHours()){
                minNV = nv;
            };
        }
        System.out.println("Nhân viên có số giờ làm thấp nhất:");
        minNV.displayInfo();
    }
    //7. sắp xếp nhân viên theo tên
    public void sapXepNhanVienTheoTen(){
        // kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }
        //sắp xếp theo tên
        //cú pháp sort trên arrayList
        //arrayList.sort( (phân từ 1, phần từ 2) -> {// thực hiện logic so sánh giữa phần tử 1 và phần từ 2)
        // sẽ -1 nếu phần tử 1 < phần tử 2
        // sẽ 0 nếu phần tử 1 = phần tử 2
        // sẽ 1 nếu phần tử 1 > phần tử 2
        danhSachNhanVien.sort((nv1, nv2) -> nv1.getName().compareTo(nv2.getName()));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tên:");
        hienThiDanhSachNhanVien();
    }
    //8. sắp xếp nhân viên theo số giờ làm
    public void sapXepNhanVienTheoSoGioLam(){
        // kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }
        //sắp xếp theo số giờ làm
        danhSachNhanVien.sort((nv1, nv2) -> Double.compare(nv1.getTotalWorkingHours(), nv2.getTotalWorkingHours()));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo số giờ làm:");
        hienThiDanhSachNhanVien();
    }
    //9. cập nhật thông tin nhân viên
    public void capNhatThongTinNhanVien(Scanner sc){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }

        // tìm thấy nhân viên cần cập nhật id hoặc tên để tìm kiếm
        System.out.println("Nhập ID nhân viên cần cập nhật: ");
        String id = sc.nextLine();
        nhanVien nv = timNhanVienTheoId(id); // nv {id, name,.....}
        //kiểm tra có tìm thấy nhân viên hay không
        if (nv == null){
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
            return; // dừng phương thức nếu không tìm thấy
        }
        //nếu tìm thấy thì cập nhật thông tin
        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương/giờ mới: ");
        double salaryPerHours = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập tổng số giờ làm mới: ");
        double totalWorkingHours = Double.parseDouble(sc.nextLine());

        //cập nhật thông tin bằng cách tạo ra một đối tượng nhân viên mới với thông tin đã cập nhật
        nv = new nhanVien(id, name, age, address, salaryPerHours, totalWorkingHours);

        //cập nhật lại thông tin nhân viên trong danh sách
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (danhSachNhanVien.get(i).getId().equals(id)) {
                danhSachNhanVien.set(i, nv); // cập nhật thông tin nhân viên tại vị trí i
                break;
            }
        }
        System.out.println("Cập nhật thông tin nhân viên thành công.");
    }

    // 11. hiển thị ra danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ
    public void hienThiNhanVienCoTongSoGioLamLonHon120(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return; // dừng phương thức
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ:");
        //lưu ý: sẽ tạo ra một danh sách mới để lưu trữ
        ArrayList<nhanVien> dsNhanVienGioLamLonHon120 = new ArrayList<>();
        for (nhanVien nv : danhSachNhanVien){
            if(nv.getTotalWorkingHours() > 120){
                dsNhanVienGioLamLonHon120.add(nv);
            }
        }
        //duyệt mảng mới để hiển thị thông tin nhân viên đạt yêu cầu đề bài
        if (dsNhanVienGioLamLonHon120.isEmpty()) {
            System.out.println("Không có nhân viên nào có tổng số giờ làm lớn hơn 120 giờ.");
        } else {
            for (nhanVien nv : dsNhanVienGioLamLonHon120) {
                nv.displayInfo();
            }
        }
    }
}
