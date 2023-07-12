/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import models.KhachHang;
import viewmodels.KhachhangViewMD;

/**
 *
 * @author Admin
 */
public interface IKhachhangServices {
    List<KhachhangViewMD> getall();
    
    String add(KhachHang khachHang);

    String update(int id, KhachHang khachHang);

    String delete(int id);
    
    
}
