/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.ChiTietSP;
import repositorys.ICTSPRepository;
import repositorys.IChatLieuRepository;
import repositorys.IDanhMucRepositoy;
import repositorys.IKhuyenmaiRepository;
import repositorys.IKichCoRepository;
import repositorys.IMauSacRepository;
import repositorys.INsxRepository;
import repositorys.IThuongHieuRepository;
import repositorys.impl.CTSPRepositoryImpl;
import repositorys.impl.ChatLieuRepositoryImpl;
import repositorys.impl.DanhMucRepositoryImpl;
import repositorys.impl.KhuyenmaiReponsitory;
import repositorys.impl.KichCoRepositoryImpl;
import repositorys.impl.MauSacRepositoryImpl;
import repositorys.impl.NSXRepositoryImpl;
import repositorys.impl.ThuongHieuRepositoryImpl;
import services.ICTSPService;
import viewmodels.ChiTietSPViewModel;
import views.frm_Sanpham;

/**
 *
 * @author Admin 88
 */
public class CTSPServiceImpl implements ICTSPService{
    private ICTSPRepository chiTietSPRepository = new CTSPRepositoryImpl();
    private INsxRepository iNSX = new NSXRepositoryImpl();
    private IMauSacRepository imausac = new MauSacRepositoryImpl();
    private IDanhMucRepositoy idanhmuc = new DanhMucRepositoryImpl();
    private IKichCoRepository ikichco = new KichCoRepositoryImpl();
    private IChatLieuRepository ichatlieu = new ChatLieuRepositoryImpl();
    private IThuongHieuRepository ithuonghieu = new ThuongHieuRepositoryImpl();
    private IKhuyenmaiRepository ikhuyenmai = new KhuyenmaiReponsitory();
 @Override
    public List<ChiTietSPViewModel> getAll() {
        List<ChiTietSP> list = chiTietSPRepository.getAll();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getByid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }
        return lst;
    }

    @Override
    public List<ChiTietSPViewModel> getlistbyTen(String ten) {
        List<ChiTietSP> list = chiTietSPRepository.getlistbyTen(ten);
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getByid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }

        return lst;
    }

    @Override
    public Date checkngay(String id) {
        return (Date) chiTietSPRepository.checkngay(id);
    }

    @Override
    public Date checkngay2(String id) {
        return (Date) chiTietSPRepository.checkngay(id);
    }

    @Override
    public boolean Add(ChiTietSPViewModel x) {
        List<ChiTietSP> lst = chiTietSPRepository.check(x.getMa());
        ChiTietSP ctsp = new ChiTietSP(x.getMa(), x.getTen(), x.getNsx().getId(), x.getMausac().getId(), x.getDanhmuc().getId(), x.getKichco().getId(), x.getChatlieu().getId(), x.getThuonghieu().getId(), 0, x.getSoluongton(), x.getGianhap(), x.getGiaban(), x.getMota(), x.getQrcode());
        try {
            ChiTietSP xyy = lst.get(0);
            JOptionPane.showMessageDialog(new frm_Sanpham(), "Không để trùng mã");

            return false;
        } catch (Exception e) {
            if (chiTietSPRepository.insert(ctsp) == 1) {
                JOptionPane.showMessageDialog(new frm_Sanpham(), "Thêm Thành công");
                return true;
            }
            JOptionPane.showMessageDialog(new frm_Sanpham(), "Thất bại");
            return false;
        }
    }

    @Override
    public boolean Update(String ma, ChiTietSPViewModel x) {
        ChiTietSP ctsp = new ChiTietSP(x.getMa(), x.getTen(), x.getNsx().getId(), x.getMausac().getId(), x.getDanhmuc().getId(), x.getKichco().getId(), x.getChatlieu().getId(), x.getThuonghieu().getId(), 0, x.getSoluongton(), x.getGianhap(), x.getGiaban(), x.getMota(), x.getQrcode());
        if (chiTietSPRepository.update(ctsp, ma) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<ChiTietSPViewModel> getSPhet() {
        List<ChiTietSP> list = chiTietSPRepository.getSPhet();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getByid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }
        return lst;
    }

    @Override
    public List<ChiTietSPViewModel> GetAll() {
        List<ChiTietSP> list = chiTietSPRepository.GetAll();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            ChiTietSPViewModel sp = new ChiTietSPViewModel();
            sp.setMa(x.getMa());
            sp.setTen(x.getTen());
            lst.add(sp);

        }
        return lst;
    }

    @Override
    public boolean Update(String ma, String id) {
        return chiTietSPRepository.Update(id, ma);
    }

    @Override
    public boolean Delete(String ma) {
        ChiTietSP ctsp = new ChiTietSP();
        if (chiTietSPRepository.delete(ma) == 1) {
            return true;
        }
        return false;
    }
   
}
