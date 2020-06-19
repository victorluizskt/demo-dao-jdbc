/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.entities.Department;

/**
 *
 * @author victor
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
    
}
