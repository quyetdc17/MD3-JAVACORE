package co.ra.strings;

public class Program {
    public static void main(String[] args) {
        String[] names = {
                "Nguyễn Văn Đức",
                "Nguyễn Hiếu Nghĩa",
                "Nguyễn Thị Hải Lộc",
                "Huỳnh Bá Trường Mỹ",
                "Lê Bá Doanh",
                "Lưu Vĩnh Thắng",
                "Nguyễn Thảo Hương",
                "Phạm Văn Thịnh",
                "Trần Văn Phú",
                "Nguyễn Thị Lan Hương",
                "Lê Công Thuỷ",
                "Ngô Quốc Việt",
                "Trần Văn Tâm",
                "Lương Hữu Kiên",
                "Nguyễn Bảo Ngọc",
                "Nguyễn Đình Xuân",
                "Nguyễn Văn Thuận",
                "Thái Hoài Thanh",
                "Huỳnh Kiến Luân",
                "Trần Quốc Khang Hy",
                "Đỗ công Quyết",
                "Lê Tài Hoàng",
                "Đỗ Thị Huyền",
                "Trần Thanh Duy",
                "Vũ Tuấn Quang",
                "Phạm Minh Long",
        };

//        searchByFullName(names, "Đỗ công Quyết");
        searchByFirstName(names, "Đỗ");
        searchByLastName(names, "Hương");
//        searchByContainsName(names, "Th");

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("XYZ");
        System.out.println(stringBuilder.toString());
    }

    public static void searchByFullName(String[] names, String fullName){
        for (String name: names) {
            if (name.equals(fullName)){
                System.out.println(name);
            }
        }
    }
    public static void searchByFirstName(String[] names, String firstName){
        for (String name: names) {
            if (name.startsWith(firstName)){
                System.out.println(name);
            }
        }
    }
    public static void  searchByLastName(String[] names, String lastName){
        for (String name: names) {
            if (name.endsWith(lastName)){
                System.out.println(name);
            }
        }
    }
    public static void searchByContainsName(String[] names, String charA){
        for (String name: names) {
            if (name.contains(charA)){
                System.out.println(name);
            }
        }
    }
}
