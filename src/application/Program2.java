/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 *
 * @author victor
 */
public class Program2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Department dep = null;
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("===TEST 1: findById===");
        dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n==== TEST 2: findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n==== TEST 3: Insert ====");
        // Department newDepartment = new Department(null, "Music");
        //departmentDao.insert(newDepartment);
        //System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Update ====");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update sucess.");
        
        System.out.println("\n===TEST 5: DELETE ===");
        System.out.println("Enter id for delete test: ");
        int id = input.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed.");
    }

}
