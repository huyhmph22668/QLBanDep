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
import models.DanhMuc;
import repositorys.IDanhMucRepositoy;
import utilconnext.DBConnection;

/**
 *
 * @author Admin 88
 */
public class DanhMucRepositoryImpl implements IDanhMucRepositoy{
    final String SQL_SELECT_ALL = "SELECT Id,Ten FROM dbo.DanhMucSP";
    final String SQL_SELECT_BY_ID = "SELECT Id,Ten FROM dbo.DanhMucSP WHERE Id = ?";
    final String SQL_INSERT = "INSERT INTO dbo.DanhMucSP(Ten) VALUES(?)";
    final String SQL_UPDATE = "UPDATE dbo.DanhMucSP SET Ten = ? WHERE Id = ?";
    final String SQL_DELETE = "DELETE dbo.DanhMucSP WHERE Id = ?";

    @Override
    public List<DanhMuc> getAll() {

        return getdataquery(SQL_SELECT_ALL);

    }

    @Override
    public int insert(DanhMuc x) {

        return DBConnection.ExcuteQuery(SQL_INSERT, x.getTen());

    }

    @Override
    public int update(DanhMuc dmsp, int id) {
        return DBConnection.ExcuteQuery(SQL_UPDATE, dmsp.getTen(), id);
    }

    @Override
    public int delete(int id) {
        return DBConnection.ExcuteQuery(SQL_DELETE, id);
    }

    @Override
    public DanhMuc getdanhmucbyid(int id) {
        if (id == 0) {
            return new DanhMuc();
        }
        return getdataquery(SQL_SELECT_BY_ID, id).get(0);
    }

    private List<DanhMuc> getdataquery(String SQL, Object... arvg) {
        List<DanhMuc> lst = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
            while (rl.next()) {
                lst.add(new DanhMuc((int) rl.getObject(1), (String) rl.getObject(2)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DanhMucRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;

    }
}
