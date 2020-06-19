/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author victor
 */
public class Department implements Serializable {
    // In java, we need to implement serializable if we are going to use the data in a network.
    private static final long serialVersionUID = 1L;
    // Atributtes
    private Integer id;
    private String name;

    // Construct
    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Gett and Sett
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // hashCode and equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        return Objects.equals(this.id, other.id);
    }
    
    // toString
    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name;
    }

}
