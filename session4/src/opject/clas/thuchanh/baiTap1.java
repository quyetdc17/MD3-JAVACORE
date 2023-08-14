package opject.clas.thuchanh;

public class baiTap1 {
    public static void main(String[] args) {
        /**
         * Định nghĩa lớp Book gồm các thông tin
         *  bookId(String), title(String), author(String), price(double), year(int), status(boolean)
         * Trong lớp Book, khai báo 2 constructor không tham số và có tham số (khởi tạo đầy đủ các
         * thông tin của đối tượng Book). Định nghĩa 2 phương thức inputData() để nhập dữ liệu cho
         * Book và outputData() hiển thị thông tin của đối tượng Book ra màn hình
         * */
        Book sachGK = new Book("SGK","Sach Gaio Khoa","AA",1000,2023,false);
        Book sachBT = new Book();
        sachBT.inputData();
        sachBT.outputData();

        /**
         * Viết chương trình Java quản lý mảng n Quyển sách. Có các chức năng sau:
         * 1. Nhập n quyển sách
         * 2. Hiển thị danh sách các quyển sách vừa nhập
         * 3. Sắp xếp sách theo tiêu đề từ A-Z
         * 4. Tìm các quyển sách theo năm xuất bản
         * 5. Thoát chương trình
         * */
    }
}
