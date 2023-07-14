/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import java.util.List;
import models.Users;
import repositorys.IUsersRepository;
import repositorys.impl.UsersRepositoryImpl;
import services.IUsersService;
import viewmodels.UsersViewmodel;

/**
 *
 * @author Admin 88
 */
public class UsersServiceImpl implements IUsersService{
     List<UsersViewmodel> lstuser=new ArrayList<>();
    private IUsersRepository usersReposytory=new UsersRepositoryImpl();
 @Override
    public List<UsersViewmodel> getAllNhanVien() {
        lstuser = new ArrayList<>();
        for (Users us : usersReposytory.getAllNhanVien()) {
            lstuser.add(new UsersViewmodel(us.getTen(), us.getTendem(), us.getHo(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getTk(), us.getMk(), us.getEmail(), us.getChucVu(), us.getTT()));
        }
        return lstuser;
    }

    @Override
    public boolean add(UsersViewmodel nv) {
        boolean isAdd = usersReposytory.add(new Users(nv.getTen(), nv.getTendem(), nv.getHo(), nv.getNgaysinh(), nv.getGioitinh(), nv.getSdt(), nv.getTk(), nv.getMk(), nv.getEmail(), nv.getChucVu(), nv.getTT()));
        return isAdd;
    }

    @Override
    public boolean update(UsersViewmodel us, String id) {
        return usersReposytory.update(new Users(us.getTen(), us.getTendem(), us.getHo(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getTk(), us.getMk(), us.getEmail(), us.getChucVu(), us.getTT()), id);
    }

    @Override
    public boolean delete(String id) {
        return usersReposytory.delete(id);
    }

    @Override
    public List<UsersViewmodel> SearchNVV(String Ten) {
        lstuser = new ArrayList<>();
        for (Users us : usersReposytory.SearchNVV(Ten)) {
            lstuser.add(new UsersViewmodel(us.getTen(), us.getTendem(), us.getHo(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getTk(), us.getMk(), us.getEmail(), us.getChucVu(), us.getTT()));
        }
        return lstuser;
    }

    @Override
    public boolean updateMK(UsersViewmodel us, String mail) {
        return usersReposytory.updateMK(new Users(us.getMk()), mail);
    }

    @Override
    public String kiemtra(String mail) {
        return usersReposytory.kiemtra(mail);
    }

    @Override
    public Users getUserbytk(String tk) {
        return usersReposytory.getUserbytk(tk);
    }

    @Override
    public String kiemtrasdt(String sdt) {
        return usersReposytory.kiemtrasdt(sdt);
    }

    @Override
    public String kiemtratk(String tk) {
        return usersReposytory.kiemtratk(tk);
    }
  
}