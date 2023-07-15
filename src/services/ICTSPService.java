/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.sql.Date;
import java.util.List;
import viewmodels.ChiTietSPViewModel;

/**
 *
 * @author Admin 88
 */
public interface ICTSPService {
     public List<ChiTietSPViewModel> getAll();

    public List<ChiTietSPViewModel> getlistbyTen(String ten);

    boolean Add(ChiTietSPViewModel x);

    boolean Update(String ma, ChiTietSPViewModel x);
    
    boolean Delete(String ma);

    public List<ChiTietSPViewModel> getSPhet();

    public Date checkngay(String id);

    public Date checkngay2(String id);

    public List<ChiTietSPViewModel> GetAll();

    public boolean Update(String ma, String id);
}
