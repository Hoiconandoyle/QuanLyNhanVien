import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Management implements Interface {
    final static String URL = "jdbc:mysql://11.230.50.200:3306/quanly";
    final static String USERNAME = "admin";
    final static String PASSWORD = "@dmin1234";

    public Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return conn;
    }

    /*
        Magement Employee
    */
    
    public void addEmployee(Employee emp) {
        String query = "insert into employee values(?, ?, ?, ?, ?, ?,?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // "2", "BẢO", false, "TP.HCM", 0364123411, "bao@gmail.com", "D01"

            ps.setString(1, emp.getEmployee_id());
            ps.setString(2, emp.getEmployee_name());
            ps.setBoolean(3, emp.isSex());
            ps.setString(4, emp.getAddress());
            ps.setString(5, emp.getPhone());
            ps.setString(6, emp.getEmail());
            ps.setString(7, emp.getDepartment().getDepartment_id());
            
            ps.executeUpdate();
            System.out.println("Thêm nhân viên thành công!");

        } catch (SQLException ex) {
            System.out.println("Thêm nhân viên lỗi " + ex.getMessage());
        }
    }

    public void deleteEmployee(String emp_id) {
        String query = "DELETE FROM employee WHERE employee_id = ?";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // employee_id = 2

            ps.setString(1, emp_id);
            ps.executeUpdate();
            System.out.println("Xóa nhân viên thành công");

        } catch (Exception ex) {
            System.out.println("Xóa nhân viên lỗi " + ex.getMessage());
        }
    }

    public void updateEmployee(Employee emp) {
        // UPDATE SET WHERE
        String query = "UPDATE employee SET employee_name = ?, sex = ?, address = ?, phone = ?, email = ?, department_id = ? WHERE employee_id = ?";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // "3", "BẢO", false, "TP.HCM", 0364123411, "bao@gmail.com", "D01" -> name = HUY where id = 3

            ps.setString(1, emp.getEmployee_name());
            ps.setBoolean(2, emp.isSex());
            ps.setString(3, emp.getAddress());
            ps.setString(4, emp.getPhone());
            ps.setString(5, emp.getEmail());
            ps.setString(6, emp.getDepartment().getDepartment_id());
            ps.setString(7, emp.getEmployee_id());
            
            ps.executeUpdate();
            System.out.println("Cập nhật thông tin nhân viên thành công!");

        } catch (SQLException ex) {
            System.out.println("Cập nhật thông tin nhân viên lỗi " + ex.getMessage());
        }
    }

    public void addDepartment(Department dep) {
        String query = "insert into department values(?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // "2", "BẢO", false, "TP.HCM", 0364123411, "bao@gmail.com", "D01"

            ps.setString(1, dep.getDepartment_id());
            ps.setString(2, dep.getDepartment_name());
            ps.executeUpdate();

            System.out.println("Thêm phòng ban thành công!");

        } catch (SQLException ex) {
            System.out.println("Thêm phòng ban lỗi " + ex.getMessage());
        }
    }
    
    public void deleteDepartment(String dep_id) {
        String query = "DELETE FROM department WHERE department_id = ?";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // employee_id = 2

            ps.setString(1, dep_id);
            ps.executeUpdate();
            System.out.println("Xóa phòng ban thành công");

        } catch (Exception ex) {
            System.out.println("Xóa phòng ban lỗi " + ex.getMessage());
        }
    }

    public void updateDepartment(Department dep) {
        // UPDATE SET WHERE
        String query = "UPDATE department SET department_name = ? WHERE department_id = ?";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(query)) {
            // "3", "BẢO", false, "TP.HCM", 0364123411, "bao@gmail.com", "D01" -> name = HUY where id = 3

            ps.setString(1, dep.getDepartment_name());
            ps.setString(2, dep.getDepartment_id());
            
            ps.executeUpdate();
            System.out.println("Cập nhật thông tin phòng ban thành công!");

        } catch (SQLException ex) {
            System.out.println("Cập nhật thông tin phòng ban lỗi " + ex.getMessage());
        }
    }

}