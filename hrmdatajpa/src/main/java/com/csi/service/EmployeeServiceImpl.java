package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee signUp(Employee employee) {

        //return employeeDaoImpl.signUp(employee);
        return employeeRepoImpl.save(employee);
    }


    public Optional<Employee> getDataById(long empId) {
        //return employeeDaoImpl.getDataById(empId);
        return employeeRepoImpl.findById(empId);
    }

    public List<Employee> getAllData() {
        //return employeeDaoImpl.getAllData();
        return employeeRepoImpl.findAll();
    }

    public List<Employee> getDataByName(String empFirstName) {
       // return employeeDaoImpl.getDataByName(empFirstName);
        return employeeRepoImpl.findByEmpFirstName(empFirstName);
    }


    public Employee getDataByEmailId(String empEmailId) {
        //return employeeDaoImpl.getDataByEmailId(empEmailId);
        return employeeRepoImpl.findByEmpEmailId(empEmailId);
    }

    public Employee updateData(Employee employee) {
        //return employeeDaoImpl.updateData(employee);
        return employeeRepoImpl.save(employee);
    }

    public void deleteDataById(long empId) {
       // employeeDaoImpl.deleteDataById(empId);
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAllData() {
        //employeeDaoImpl.deleteAllData();
        employeeRepoImpl.deleteAll();
    }

   }
