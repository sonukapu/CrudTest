/*
package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee signUp(Employee employee) {

        return employeeRepoImpl.save(employee);
    }


    public Optional<Employee> getDataById(long empId){
        return employeeRepoImpl.findById(empId);
    }

    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public List<Employee> getDataByName(String empFirstName){
        return employeeRepoImpl.findByEmpFirstName(empFirstName);
    }


    public Employee getDataByEmailId(String empEmailId){

        return employeeRepoImpl.findByEmpEmailId(empEmailId);
    }


    public Employee updateData(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public void deleteDataById(long empId){
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAllData(){
        employeeRepoImpl.deleteAll();
    }


}
*/
