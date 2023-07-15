/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.DanhMuc;
import repositorys.IDanhMucRepositoy;
import repositorys.impl.DanhMucRepositoryImpl;
import services.IDanhMucService;
import viewmodels.Objecttt;
/**
 *
 * @author Admin 88
 */
public class DanhMucServiceImpl implements IDanhMucService{
     private IDanhMucRepositoy danhMucSPRepository = new DanhMucRepositoryImpl();

    @Override
    public List<DanhMuc> getAll() {
        return danhMucSPRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        DanhMuc danhmuc = new DanhMuc(x.getId(), x.getTen());
        int them = danhMucSPRepository.insert(danhmuc);
        if (them == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        DanhMuc danhmuc = new DanhMuc(x.getId(), x.getTen());
        int sua = danhMucSPRepository.update(danhmuc, id);
        if (sua == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (danhMucSPRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public DanhMuc getbyid(int id) {
        return danhMucSPRepository.getdanhmucbyid(id);
    }
}
