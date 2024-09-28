public class Employee {
    private String employee_id;
    private String employee_name;
    private boolean sex;
    private String address;
    private String phone;
    private String email;
    private Department department_id;

    public Employee(String employee_id, String employee_name, boolean sex, String address, String phone, String email,
            Department department_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.department_id = department_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department_id;
    }

    public void setDepartment(Department department_id) {
        this.department_id = department_id;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", sex=" + sex
                + ", address=" + address + ", phone=" + phone + ", email=" + email + ", department_id=" + department_id
                + "]";
    }

    

}