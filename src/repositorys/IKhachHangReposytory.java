/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys;

import java.util.List;
import models.KhachHang;

/**
 *
 * @author Admin
 */
public interface IKhachHangReposytory {
    List<KhachHang> getall();
    
     boolean add(KhachHang khachhang);

    boolean update(int id, KhachHang khachhang);

    boolean delete(int id);
}
