/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import javax.swing.JOptionPane;
import models.User;
import repositorys.IUserRepository;
import repositorys.impl.UserRepositoryImpl;
import services.IUserService;
import views.frm_Dashboard;
import views.frm_Login;

/**
 *
 * @author Admin 88
 */
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepostory;

    public UserServiceImpl() {
        userRepostory = new UserRepositoryImpl();
    }

    @Override
    public boolean getUser(String TaiKhoan, String MatKhau) {
        List<User> list = userRepostory.getUser(TaiKhoan, MatKhau);
        if (TaiKhoan.isEmpty()) {
            JOptionPane.showMessageDialog(new frm_Login(), "Vui lòng nhập tài khoản!");
            return false;
        }
        if (MatKhau.isEmpty()) {
            JOptionPane.showMessageDialog(new frm_Login(), "Vui lòng nhập mật khẩu!");
            return false;
        }
        if (list != null) {
            for (User x : list) {
                if (x.getChucVu().getTen().equalsIgnoreCase("quản lý")) {
                    JOptionPane.showMessageDialog(new frm_Login(), "Đăng nhập thành công! [Quản Lý]");
                    String tenNV = x.getHo() + " " + x.getTenDem() + " " + x.getTen();
                    new frm_Dashboard(tenNV, x.getId(), x.getChucVu().getTen()).setVisible(true);
                    return true;

                } else {
                    JOptionPane.showMessageDialog(new frm_Login(), "Đăng nhập thành công! [Nhân Viên]");
                    String tenNV = x.getHo() + " " + x.getTenDem() + " " + x.getTen();
                    new frm_Dashboard(tenNV, x.getId(), x.getChucVu().getTen()).setVisible(true);
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(new frm_Login(), "Sai Tài Khoản Hoặc Mật Khẩu");
        return false;
    }
}
