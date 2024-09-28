public interface Interface {
    
    public interface InnerInterface {

        // Department
        void addDepartment(Department dep);
        void deleteDepartment(Department dep);
        void updateDepartment(Department dep);
        
        // Employee
        void addEmployee(Employee emp);
        void deleteEmployee(String employee_id);
        void updateEmployee(Employee emp);

    }
}
