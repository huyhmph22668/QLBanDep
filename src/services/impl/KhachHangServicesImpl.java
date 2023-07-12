/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import java.util.List;
import models.KhachHang;
import repositorys.IKhachHangReposytory;
import repositorys.impl.KhachHangReposirotyImpl;
import services.IKhachhangServices;
import viewmodels.KhachhangViewMD;

/**
 *
 * @author Admin
 */
public class KhachHangServicesImpl implements IKhachhangServices{
   private IKhachHangReposytory khachhang01 = new KhachHangReposirotyImpl();
   
    @Override
    public List<KhachhangViewMD> getall() {
        List<KhachhangViewMD> list01 = new ArrayList<>();

        List<KhachHang> list = khachhang01.getall();
        for (KhachHang x : list) {
            list01.add(new KhachhangViewMD(x.getId(), x.getTen(), x.getTendem(), x.getHo(), x.getGioitinh(), x.getNgaysinh(), x.getEmail(), x.getSdt(), x.getDiemthuong()));
        }
        return list01;
    }

    @Override
    public String add(KhachHang khachHang) {
        boolean addkhachhang = khachhang01.add(khachHang);
        if(addkhachhang){
            return "Thêm thành công";
        }
        return "Thêm thất bại ";
    }

    @Override
    public String update(int id, KhachHang khachHang) {
        boolean updatekhachhang = khachhang01.update(id, khachHang);
        if(updatekhachhang){
            return "Sửa Thành công Id = " + id;
        }
        return "Sửa Thất bại ";
    }

    @Override
    public String delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    
   
}
