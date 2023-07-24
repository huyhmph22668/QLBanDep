
package services.impl;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.KhuyenMai;
import repositorys.IKhuyenmaiRepository;
import repositorys.impl.KhuyenmaiReponsitory;
import services.IKhuyenmaiService;
import viewmodels.KhuyenmaiViewmodel;


public class KhuyenmaiService implements IKhuyenmaiService {

    private IKhuyenmaiRepository repository;
    private List<KhuyenmaiViewmodel> lstKM;

    public KhuyenmaiService() {
        repository = new KhuyenmaiReponsitory();
    }

    @Override
    public List<KhuyenmaiViewmodel> GetALL() {
        List<KhuyenMai> lst = repository.GetAll();
        lstKM = new ArrayList<>();
        for (KhuyenMai x : lst) {
            lstKM.add(new KhuyenmaiViewmodel(x.getTenKM(), x.getHinhThucKM(), x.getNgayBatDau(), x.getNgayKetThuc(), x.getGiaTriGiam(), x.getTrangthai()));
        }
        return lstKM;
    }

    @Override
    public boolean Add(KhuyenmaiViewmodel km) {
        boolean isAdd = repository.Add(new KhuyenMai(km.getTenKM(), km.getHinhThucKM(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getGiaTriGiam(), km.getTrangthai()));
        return isAdd;
    }

    @Override
    public boolean Update(KhuyenmaiViewmodel km, String id) {
        boolean isUpdate = repository.Update(new KhuyenMai(km.getTenKM(), km.getHinhThucKM(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getGiaTriGiam(), km.getTrangthai()), id);
        return isUpdate;
    }

    @Override
    public boolean Delete(String id) {
        boolean isDelete = repository.Delete(id);
        return isDelete;
    }

    @Override
    public String checktrung(String ten) {
        return repository.checktrung(ten);
    }


    @Override
    public List<KhuyenMai> getlist() {
        return repository.GetAll();
    }

    @Override
    public boolean UpdateTT2() {
        boolean iscapnhat = repository.UpdateTT2();
        return iscapnhat;
    }

   @Override
    public boolean UpdateTT() {
        boolean iscapnhat = repository.UpdateTT();
        return iscapnhat;
    }

}
