package cafebar.shop.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePassWord;
    private String employeePhone;
    private String employeeAddress;
    private boolean employeeStatus;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String employeeEmail, String employeePassWord, String employeePhone, String employeeAddress, boolean employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePassWord = employeePassWord;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.employeeStatus = employeeStatus;
    }

    public String getEmployeePassWord() {
        return employeePassWord;
    }

    public void setEmployeePassWord(String employeePassWord) {
        this.employeePassWord = employeePassWord;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public boolean isEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
