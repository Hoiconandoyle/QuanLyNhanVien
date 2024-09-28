public class App {
    public static void main(String[] args) {
        Department dep = new Department("D01", "Maketing");

        Employee emp = new Employee("2", "HUY", false, "Bình Dương", "03641211", "huy@gmail.com", dep);

        Management management = new Management();
        // management.deleteEmployee("2");

        // String update_id = "5";

        // management.updateEmployee(emp);

        management.addEmployee(emp);

    }
}
