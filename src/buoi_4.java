import java.util.ArrayList;
import java.util.Collections;

public class buoi_4 {
    public static void main(String[] args) {
        //arraylist: là một cấu trúc dữ liệu động, có thể thay đổi kích thước trong quá trình thực thi chương trình
        //cú pháp: ArrayList<kiểu dữ liệu> tenArrayList = new ArrayList<>();

        //ví dụ: mảng string điện thoại: iphone, samsung, xiaomi, oppo, realme
        ArrayList<String> mangDienThoai = new ArrayList<>();

        //CRUD cho arraylist: Create, Read, Update, Delete
        //thêm phần tử vào arraylist: sử dụng phương thức add()
        //cú pháp: tenArrayList.add(giá trị);
        mangDienThoai.add("iphone"); //mangDienThoai = ["iphone"]
        mangDienThoai.add("samsung"); //mangDienThoai = ["iphone", "samsung"]
        mangDienThoai.add("xiaomi");
        mangDienThoai.add("oppo");
        mangDienThoai.add("realme");//mangDienThoai = ["iphone", "samsung", "xiaomi", "oppo", "realme"]
        System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);

        //thêm vào vị trí cụ thể: sử dụng phương thức add(index, giá trị);
        mangDienThoai.add(1, "nokia"); //mangDienThoai = ["iphone", "nokia", "samsung", "xiaomi", "oppo", "realme"]
        System.out.println("Giá trị của mảng điện thoại sau khi thêm nokia vào vị trí index 1: " + mangDienThoai);

        //cập nhật giá trị trong mảng: sử dụng phương thức set(index, giá trị);
        mangDienThoai.set(3, "huawei"); //mangDienThoai = ["iphone", "nokia", "samsung", "huawei", "oppo", "realme"]
        System.out.println("Giá trị của mảng điện thoại sau khi cập nhật giá trị tại vị trí index 3: " + mangDienThoai);

        //xóa phần tử trong mảng: sử dụng phương thức remove(index);
        mangDienThoai.remove(2); //mangDienThoai = ["iphone", "nokia", "huawei", "oppo", "realme"]
        System.out.println("Giá trị của mảng điện thoại sau khi xóa phần tử tại vị trí index 2: " + mangDienThoai);

        //duyệt mảng
        for ( String dienThoai : mangDienThoai){
            System.out.println("Tên điện thoại: " + dienThoai);
        }


        //đếm số lượng phần tử trong mảng: sử dụng phương thức size();
        int soLuong = mangDienThoai.size();
        System.out.println("Số lượng phần tử trong mảng điện thoại: " + soLuong);

        ArrayList<Integer> mangSo = new ArrayList<>();
        mangSo.add(5);
        mangSo.add(2);
        mangSo.add(8);
        mangSo.add(1);
        //sắp xếp phần tử trong mảng: sử dụng phương thức sort()
        Collections.sort(mangSo); // sắp xếp theo thứ tự tăng dần
        System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp: " + mangSo);
        //sau khi sắp xếp tăng dần rồi đảo ngược mảng: sử dụng phương thức reverse()
        Collections.reverse(mangSo);
        System.out.println("Giá trị của mảng điện thoại sau khi sắp xếp theo thứ tự giảm dần: " + mangSo);
        //tìm kiếm phần tử trong mảng: sử dụng phương thức contains()
        boolean ketQua = mangDienThoai.contains("iphone"); //true hoặc false
        boolean ketQua2 = mangSo.contains(2);
        System.out.println("Kết quả tìm kiếm phần tử 'iphone' trong mảng điện thoại: " + ketQua);
        System.out.println("Kết quả tìm kiếm phần tử '2' trong mảng số: " + ketQua2);

        //object và class:
        //class: là một khuôn mẫu để tạo ra các đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //object là một thực thể cụ thể được tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        //class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế đó
    }
}
