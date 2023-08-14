package com.ra.trenlop.thuchanh1;

public class Student {
    // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
    private String id;
    // Không bỏ trống, viết IN HOA không dấu
    private String name;
    // Không bỏ trống, đúng định dạng email
    private String email;
    // Không bỏ trống,đúng định dạng SĐT
    private String phone;
    // Không bỏ trống, phải nhập true/false
    private boolean status;

    public Student() {
    }

    public Student(String id, String name, String email, String phone, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
        if (id == null || id.equals(""))
            throw new IdNullException();
        if (!id.startsWith("SV"))
            throw new Exception("Ma sinh vien @phai bat dau bang \"SV\"");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        // Không bỏ trống, viết IN HOA không dấu
        if (name == null||name.equals("")) throw new Exception("ten khong duoc de trong");
        if (!name.toUpperCase()) throw new Exception("ten phai viet hoa khong dau");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
        // Không bỏ trống, đúng định dạng email
        if (email == null ||email.equals("")) throw new Exception("email Không duoc bỏ trống");
        if (!email.contains("@")) throw new Exception("email khong dung dinh dang");
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception{
        if (phone==null||phone.equals("")) throw new Exception("SDT Không duoc bỏ trống");
        if (!phone.)throw new Exception();
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) throws Exception{
        if (status == null ||status.) throw new Exception("Không duoc bỏ trống");
        this.status = status;
    }
}
