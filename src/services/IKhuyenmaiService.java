package services;

import java.util.List;
import models.KhuyenMai;
import viewmodels.KhuyenmaiViewmodel;

public interface IKhuyenmaiService {

    public List<KhuyenmaiViewmodel> GetALL();

    public boolean Add(KhuyenmaiViewmodel km);

    public boolean Update(KhuyenmaiViewmodel km, String id);

    public boolean Delete(String id);

    public String checktrung(String ten);

    public boolean UpdateTT();

    public boolean UpdateTT2();

    public List<KhuyenMai> getlist();
}
