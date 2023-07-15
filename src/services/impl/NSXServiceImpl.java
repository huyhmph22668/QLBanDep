/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.NSX;
import repositorys.INsxRepository;
import repositorys.impl.NSXRepositoryImpl;
import services.INsxService;
import viewmodels.Objecttt;

/**
 *
 * @author Admin 88
 */
public class NSXServiceImpl implements INsxService{
     private INsxRepository nSXRepository = new NSXRepositoryImpl();

   @Override
    public List<NSX> getAll() {
        return nSXRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        NSX nsx = new NSX(x.getId(), x.getTen());
        int xxx = nSXRepository.insert(nsx);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        NSX nsx = new NSX(x.getId(), x.getTen());
        int xxx = nSXRepository.update(nsx, id);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (nSXRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public NSX getbyid(int id) {
        return nSXRepository.getbyid(id);
    }
   
}
