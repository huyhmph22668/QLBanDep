/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ChucVu;
import repositorys.IChucVuRepository;
import utilconnext.DBConnection;

/**
 *
 * @author Admin 88
 */
public class ChucVuRepositoryImpl implements IChucVuRepository{

    @Override
    public List<ChucVu> getAllChucVu() {
         List<ChucVu> cvv = new ArrayList<>();
        String sql = "select * from ChucVu";
        ResultSet rs = null;
        try {
            rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                cvv.add(new ChucVu(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cvv;
    }
    
}
