/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import db.DB;
import java.io.IOException;
import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author victor
 */
public class DaoFactory {
    
    public static SellerDao creatSellerDao() throws IOException{
        return new SellerDaoJDBC(DB.getConnection());
    }
}
